var ang = angular.module("mainApp", [ "ngRoute" ]);
ang.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when("/main", {
		templateUrl : "app/partials/main.html",
		controller : "mainController"
	}).when("/subs", {
		templateUrl : "app/partials/side.html"/*,
		controller : "subController"
*/	}).otherwise({
		redirectTo : '/main'
	});
} ]);