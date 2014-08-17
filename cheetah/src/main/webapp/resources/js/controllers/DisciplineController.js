'use strict'

var DisciplineController = function($scope, $http){
	$scope.fetchDisciplinesList = function() {
		$http.get('disciplines/disciplineslist.json').success(function(disciplinesList){
			$scope.disciplines = disciplinesList;
		});	
	};
	$scope.fetchDisciplinesList();
}