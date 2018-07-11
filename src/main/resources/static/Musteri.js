var myApp = angular.module('Uber',[])
    .controller('MusteriController',function ($scope, $http) {

        $scope.musteri={};
        $scope.musteriler=[];

        $scope.pageOpen=function () {
            $scope.musteriGetir();

        }
        $scope.musteriGetir=function () {
            var res=$http.get('api/Musteri/FindMusteriAll');
            res.then(function (response) {
                $scope.musteriler=response.data;

            });

        }





    });