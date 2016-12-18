  
    angular.module('mainApp')
    .controller('TabctrlController', ['$scope', function($scope) {
      $scope.tab = 1;

      $scope.setTab = function(newTab){
    	
        $scope.tab = newTab;
        console.log($scope.tab);
      };

      $scope.isSet = function(tabNum){
        return $scope.tab === tabNum;
      };
  }]);