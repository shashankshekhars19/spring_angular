var ang = angular.module("mainApp");

    ang.controller('TabctrlController', function ($scope) {
        $scope.activeTab = 1;

        this.setActiveTab = function (tabId) {
        	$scope.activeTab = tabId;
        };

        this.isSet = function (tabId) {
            return $scope.activeTab === tabId;
        };
    });