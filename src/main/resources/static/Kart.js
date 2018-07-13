var myApp = angular.module('Uber',[])
    .controller('KartController',function ($scope, $http) {

        $scope.kart={};
        $scope.kartlar=[];

        $scope.pageOpen = function () {
            $scope.kartGetir();

        }
        $scope.kartGetir = function () {
            var res = $http.get('api/Kart/FindKartAll');
            res.then(function (response) {
                $scope.kartlar = response.data;
            });

        }

        $scope.kartKaydet = function (kart) {
            var res = $http.post('api/Kart/SaveKart', $scope.kart);
            res.then(function (response) {
                alert(response.data);
                $scope.kartGetir();
            })
        }

        $scope.kartSec = function (kart) {
            $scope.kart = kart;
        }

        $scope.kartSil = function (kart)
        {
            $scope.kart = kart;
            var res = $http.post("/api/Kart/DeleteKart",$scope.kart)
            res.then(function (data)
            {
                $scope.kart = {};
                $scope.kartGetir()
            })
        }




    });