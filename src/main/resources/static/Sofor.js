var myApp = angular.module('Uber',[])
    .controller('SoforController',function ($scope, $http) {

        $scope.sofor={};
        $scope.soforler=[];

        $scope.pageOpen=function () {
            $scope.soforGetir();

        }
        $scope.soforGetir=function () {
            var res=$http.get('api/Sofor/FindSoforAll');
            res.then(function (response) {
                $scope.soforler=response.data;

            });

        }





    });