{
	"variables": [],
	"info": {
		"name": "FirstCollection",
		"_postman_id": "123e9980-3471-807e-f071-03a85b152813",
		"description": "",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json"
	},
	"item": [
		{
			"name": "GetCode",
			"event": [
				{
					"listen": "test",
					"script": {
						"type": "text/javascript",
						"exec": [
							"tests[\"Status code is 200\"] = responseCode.code === 200;",
							"",
							"var jsonData = JSON.parse(responseBody);",
							"tests[\"result name is \" + environment['Value']] = jsonData.RestResponse.result.name === environment['Value'];",
							"",
							""
						]
					}
				}
			],
			"request": {
				"url": "http://services.groupkt.com/country/get/iso2code/{{Code}}",
				"method": "GET",
				"header": [],
				"body": {},
				"description": ""
			},
			"response": []
		}
	]
}