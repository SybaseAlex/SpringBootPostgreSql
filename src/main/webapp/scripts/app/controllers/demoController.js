'use strict';

angular.module('demoApp')
    .controller('DemoController',
    function($scope, DemoService) {
        
        $scope.answer = '';
        
        $scope.sendText = function() {
            $scope.answer = '';
            DemoService.add($scope.messageForPost).then(
                    function(){
                        console.log('data saved');
                    },
                    function(error){
                        console.log('error: ' + JSON.stringify(error));
                    }
            );
        }
        
        $scope.getText = function() {
            DemoService.get().then(
                    function(data){
                        console.log('data: ' + JSON.stringify(data.data));
                        $scope.answer = data.data;
                    },
                    function(error){
                        console.log('error: ' + error);
                    }
            );
        }
    });


