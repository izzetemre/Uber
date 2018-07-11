var myApp = angular.module('Uber',[])
    .controller('IslemController',function ($scope, $http) {

        // $scope.islem={};
        // $scope.islemler=[];

        $scope.pageOpen=function () {
            $scope.islemGetir();

        }
        $scope.islemGetir=function () {
            var res=$http.get('api/Islem/FindIslemAll');
            res.then(function (response) {
                $scope.islemler=response.data;

            });

        }





    });