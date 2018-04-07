// Application module
var crudApp = angular.module('crudApp', []);

crudApp.controller("DbController", [
		'$scope',
		'$http',
		'$timeout',
		'$window',
		function($scope, $http, $timeout,$window) {

			// Function to get employee details from the database
			getInfo();
			function getInfo() {
				// Sending request to EmpDetails.php files
				$http.get('customers').success(
						function(data) {
							// Stored the returned data into scope
							$scope.details = data._embedded.customer;
							console.log(data);
							return "index";
							
						});
				
			}

			$scope.exportHref = '';
			// Setting default value of gender
			$scope.empInfo = {
				'gender' : 'male'
			};
			// Enabling show_form variable to enable Add employee button
			$scope.show_form = true;
			// Function to add toggle behaviour to form
			$scope.formToggle = function() {
				$('#empForm').slideToggle();
				$('#editForm').css('display', 'none');
			}
			$scope.insertInfo = function(info) {
				$http.post('employer', JSON.stringify(info)).success(function(data) {
					if (data == true) {
						getInfo();
						$('#empForm').css('display', 'none');
					}
				});
			}
			$scope.format = function(text) {
				var position = text.indexOf(":");
				
				return text.substring(position + 1, text.length);
			}
			$scope.deleteInfo = function(detail) {
				detail.emp_id = $scope.format(detail.$$hashKey);
				detail.$$hashKey = null;
				console.log("excluindo: "+JSON.stringify(detail));
				$http.delete('/employer', JSON.stringify(detail)).success(function(data) {
					if (data == true) {
						getInfo();
					}
				});
			}
			$scope.currentUser = {};
			$scope.editInfo = function(info) {
				$scope.currentUser = info;
				$('#empForm').slideUp();
				$('#editForm').slideToggle();
			}
			$scope.UpdateInfo = function(detail) {
				$http.post('/employer', JSON.stringify(detail)).success(function(data) {
					$scope.show_form = true;
					if (data == true) {
						getInfo();
					}
				});
			}
			$scope.updateMsg = function(emp_id) {
				$('#editForm').css('display', 'none');
			}
			$scope.tableToExcel = function(tableId,worksheetName) {
				var uri='data:application/vnd.ms-excel;base64,',
		        template='<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>',
		        base64=function(s){
		    		return $window.btoa(unescape(encodeURIComponent(s)));
		    		},
		        format=function(s,c){return s.replace(/{(\w+)}/g,function(m,p){return c[p];})};
		        	var table=$(tableId),
	                ctx={worksheet:worksheetName,table:table.html()},
	                href=uri+base64(format(template,ctx));
	            return href;
			}
			
			  $scope.exportToExcel=function(tableId){ // ex: '#my-table'
		            var exportHref=$scope.tableToExcel(tableId,'sheet name');
		            $timeout(function(){location.href=exportHref;},100); // trigger download
		        }
			
		} ]);

