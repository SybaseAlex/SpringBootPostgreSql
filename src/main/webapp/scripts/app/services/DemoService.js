'use strict';

angular.module('demoApp')
    .factory('DemoService', function($http) {
        return {
            add: function(data) {
              var promise = $http.put('/persist?data=' + data, data, {})
                      .then(function(response) {
                                return response.data;
                            });
              return promise;
            },
            get: function() {
              var promise = $http.get('/getRandomData', {})
                                .then(function(response) {
                                    return response.data;
                                });
              return promise;  
            }
        }
    })