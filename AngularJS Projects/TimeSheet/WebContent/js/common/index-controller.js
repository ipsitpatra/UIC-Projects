angular.module('cal.etherios.demo', ['ngAnimate', 'ng', 'ui.bootstrap']);
angular.module('cal.etherios.demo').controller('PickSundayCtrl', function ($scope, $http) {

    $scope.submit = function () {
        $scope.fields.Weekend__c = $scope.dt;
        var dataObj = $scope.fields;
        var jsonString = JSON.stringify(dataObj);
        console.log(jsonString);
//        var res = $http.post('CallRestService', jsonString);
        
        var res = $http({
            method: "post",
            url: "CallRestService",
//            transformRequest: transformRequestAsFormPost,
            data: dataObj/*{
                id: 4,
                name: "Kim",
                status: "Best Friend"
            }*/,
            headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        }
        });
        
        
        alert("hello");
        res.success(function (data) {
            $scope.msg = true;
            var jsonString = JSON.stringify(data);
            console.log(data);
            $scope.errorMsg = "Salesforce Plateform Successfully called. New object created with id : "+data.id;
        });
        res.error(function (data) {
            $scope.msg = true;
            $scope.errorMsg = "Error";
        });
//        var dayLog=$scope.fields.day;
//        console.log("ipSIT"+$scope.dt);
//        console.dir(data);
//        var jsonString = JSON.stringify(dataObj);
//        console.log(jsonString);
//        var username = $scope.username; //rootScope
//        var password = $scope.password;
//        if (username == 'ipsit' && password == 'ipsit') {
//            $rootScope.loginSession = true;
//            $rootScope.user = username;
//            $rootScope.time = new Date();
//            $location.path('/index');
//        } else {
        $scope.msg = true;
        $scope.errorMsg = "Processing..";
//        }
    };
    $scope.weekdays =
            [
                {
                    name: 'Monday'
                },
                {
                    name: 'Tuesday'
                },
                {
                    name: 'Wednesday'
                },
                {
                    name: 'Thursday'
                },
                {
                    name: 'Friday'
                },
                {
                    name: 'Saturday'
                },
                {
                    name: 'Sunday'
                }

            ];

    $scope.clear = function () {
        $scope.mustShow = false;
        $scope.msg = false;
        $scope.dt = null;
        $scope.errorMsg = "";
    };

    $scope.hidding = function () {
        $scope.dt = null;
    };
    $scope.hidding();

    $scope.genday = function () {
        $scope.msg = false;
        if ($scope.dt !== null) {
            $scope.mustShow = true;
            var a = new Date($scope.dt);
            a.setDate(a.getDate() - 6);
            $scope.mon = a;
            var b = new Date($scope.dt);
            b.setDate(b.getDate() - 5);
            $scope.tue = b;
            var c = new Date($scope.dt);
            c.setDate(c.getDate() - 4);
            $scope.wed = c;
            var d = new Date($scope.dt);
            d.setDate(d.getDate() - 3);
            $scope.thu = d;
            var e = new Date($scope.dt);
            e.setDate(e.getDate() - 2);
            $scope.fri = e;
            var f = new Date($scope.dt);
            f.setDate(f.getDate() - 1);
            $scope.sat = f;
        } else {
            alert('Please Select a Sunday to populate a week for Time Sheet');
        }
    };

    // Disable weekend selection
    $scope.disabled = function (date, mode) {

        return (mode === 'day' && date.getDay() !== 0);
    };

    $scope.toggleMin = function () {
//    $scope.minDate = new Date(1000, 5, 22);
        $scope.minDate = $scope.minDate ? null : new Date();
    };
    $scope.toggleMin();
    $scope.maxDate = new Date(2020, 5, 22);

});

    