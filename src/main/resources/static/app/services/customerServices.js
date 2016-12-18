var ang = angular.module("mainApp");
ang.factory('customService', function($http) {

    var myResult = {};

    myResult.getCustomer = function() {
      return $http.get('myApplication/getCustomer');
    }
    return myResult;
});