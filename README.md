JerseyApp
==========

This git repository is Spring-boot with Jersey implementation. The jerseyapp is used to Geocode a address. 

Usage
------

git clone https://github.com/ajaysenreddy/JerseyApp.git
cd JerseyApp
mvn clean install

How to Use
-----------

After you have completed the above steps, you can perform the below steps.
cd target
java -jar jerseyapp-<version>.jar
ex: _java -jar jerseyapp-1.0-SNAPSHOT.jar_

You can use any rest client that you have on your machine or you can download from internet 
ex. (Postman, SOAP UI or Advanced Rest Client etc.) to see how this application works.

In my case, I am using Advanced REST client a chrome extension to make a call to this rest api and getting the geocoded address information from Google Geocoding API. 
Request
--------
Http method : **_GET_**
Enter the URL :  _http://localhost:8080/rest/geocoding?address=100 E Remington Dr, Sunnyvale_

Response
---------
{
	"status": "OK",
	"results": [{
		"formatted_address": "100 E Remington Dr, Sunnyvale, CA 94087, USA",
		"address_components": [{
			"long_name": "100",
			"short_name": "100",
			"types": ["street_number"]
		}, {
			"long_name": "East Remington Drive",
			"short_name": "E Remington Dr",
			"types": ["route"]
		}, {
			"long_name": "Sunnyvale",
			"short_name": "Sunnyvale",
			"types": ["locality", "political"]
		}, {
			"long_name": "Santa Clara County",
			"short_name": "Santa Clara County",
			"types": ["administrative_area_level_2", "political"]
		}, {
			"long_name": "California",
			"short_name": "CA",
			"types": ["administrative_area_level_1", "political"]
		}, {
			"long_name": "United States",
			"short_name": "US",
			"types": ["country", "political"]
		}, {
			"long_name": "94087",
			"short_name": "94087",
			"types": ["postal_code"]
		}],
		"place_id": "EiwxMDAgRSBSZW1pbmd0b24gRHIsIFN1bm55dmFsZSwgQ0EgOTQwODcsIFVTQQ",
		"geometry": {
			"location": {
				"lat": 37.3589845,
				"lng": -122.0321302
			},
			"location_type": "RANGE_INTERPOLATED",
			"viewport": {
				"northeast": {
					"lat": 37.3603409302915,
					"lng": -122.0307812697085
				},
				"southwest": {
					"lat": 37.3576429697085,
					"lng": -122.0334792302915
				}
			}
		}
	}]
}





