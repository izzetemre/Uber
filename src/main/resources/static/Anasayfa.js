var myApp = angular.module('Uber',[])
    .controller('AnasayfaController',function ($scope, $http) {

        // $scope.sofor={};
        // $scope.soforler=[];
        // $scope.kart={};
        // $scope.kartlar=[];

        $scope.pageOpen = function () {
            $scope.soforGetir();
            $scope.kartGetir();
            $scope.tarihAl();

        }
        $scope.soforGetir = function () {
            var res = $http.get('api/Sofor/FindSoforAll');
            res.then(function (response) {
                $scope.soforler = response.data;
            });

        }

        $scope.kartGetir = function () {
            var res = $http.get('api/Kart/FindKartAll');
            res.then(function (response) {
                $scope.kartlar = response.data;
            });

        }


        $scope.islemKaydet = function (islem) {
            var res = $http.post('api/Islem/SaveIslem', $scope.islem);
            res.then(function (response) {
                alert(response.data);
            })
        }

        $scope.tarihAl = function () {
            var tarihSaat = new Date();
            document.getElementById("tarih").innerHTML = tarihSaat.toLocaleDateString();;
            document.getElementById("saat").innerHTML = tarihSaat.toLocaleTimeString();

        }






    });