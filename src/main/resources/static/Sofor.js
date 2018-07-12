var myApp = angular.module('Uber',[])
    .controller('SoforController',function ($scope, $http) {

         $scope.sofor={};
         $scope.soforler=[];

        $scope.pageOpen = function () {
            $scope.soforGetir();

        }
        $scope.soforGetir = function () {
            var res = $http.get('api/Sofor/FindSoforAll');
            res.then(function (response) {
                $scope.soforler = response.data;
            });

        }

        $scope.soforKaydet = function (sofor) {
            var res = $http.post('api/Sofor/SaveSofor', $scope.sofor);
            res.then(function (response) {
                alert(response.data);
                $scope.soforGetir();
            })
        }

        $scope.soforSec = function (sofor) {
            $scope.sofor = sofor;
        }

        $scope.soforSil = function (sofor)
        {
            $scope.sofor = sofor;
            var res = $http.post("/api/Sofor/DeleteSofor",$scope.sofor)
            res.then(function (data)
            {
                $scope.sofor = {};
                $scope.soforGetir()
            })
        }




    });