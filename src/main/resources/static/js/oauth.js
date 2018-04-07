var app = angular.module('myApp', ["ngResource","ngRoute","ngCookies"]);
app.controller('mainCtrl', 
  function($scope, $resource, $http, $cookies) {
	
    $scope.data = {
        grant_type:"password", 
        username: "lojakis", 
        password: "100307", 
        client_id: "clientIdPassword"
    };
    $scope.encoded = btoa("clientIdPassword:secret");
     
    $scope.login = function() {   
        var req = {
            method: 'GET',
            url: "https://auth.mercadolibre.com.ar/authorization?grant_type=password&response_type=token&redirect_url=https:localhost:8443/home",
          /*  headers: {
                "Authorization": "Basic " + $scope.encoded,
                "Content-type": "application/x-www-form-urlencoded; charset=utf-8"
            },*/
            data: $scope.data
        }
        $http(req).then(function(data){
        	console.log(data);
            $http.defaults.headers.common.Authorization = 
              'Bearer ' + data.data.access_token;
            $cookies.put("access_token", data.data.access_token);
            window.location.href="home";
        });   
   }    
});