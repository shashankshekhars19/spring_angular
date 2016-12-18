var ang = angular.module("mainApp");
ang.controller('mainController',function($scope,customService){
	
	 $scope.result = function () {

	    customService.getCustomer().success(function (response) {
	        //Digging into the response to get the relevant data
	        $scope.customer = response;
	        
	        console.log($scope.customer);
	        console.log("sfjgj");
	    });
	 }
});