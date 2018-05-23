package com.fyd.hobohunt.domain;

import lombok.Data;

@Data
public class Destination {

	private Long id;

	private String name;

	private String author;

	private String logoUrl;

	private Long likes;
	
	private String description;
	
}

//{
//	   "trip":{
//	      "url":"https://www.atameo.com/trips/5810a003f90fff07bfdd193f",
//	      "updatedAt":"2017-10-01T12:22:49.478Z",
//	      "createdAt":"2014-02-18T04:50:34.000Z",
//	      "source":{
//	         "provider":"epiclist",
//	         "resource":"Journey",
//	         "id":2772
//	      },
//	      "privacy":"public",
//	      "description":"Board a train, hit the road, cruise the waters and embrace some pedal power. There's hundreds of ways to explore this crazy part of the world. We'll show you just a few.",
//	      "name":"Vietnam - Peninsula Wanderer",
//	      "type":"adventure",
//	      "traveller":{
//	         "picture":"58109fcef90fff07bfdcaf20",
//	         "name":{
//	            "first":"Fiona",
//	            "last":"Black",
//	            "full":"Fiona Black"
//	         },
//	         "id":"5810a042f90fff07bfde1ac9"
//	      },
//	      "cover":"58109fcef90fff07bfdca82e",
//	      "commentsCount":0,
//	      "comments":[
//
//	      ],
//	      "picturesCount":6,
//	      "pictures":[
//	         {
//	            "updatedAt":"2017-01-04T17:30:03.389Z",
//	            "createdAt":"2014-02-18T13:08:53.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Asset",
//	               "id":16920
//	            },
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "extension":".jpg",
//	            "fileName":"58109fcef90fff07bfdca82e",
//	            "height":0,
//	            "width":0,
//	            "cover":true,
//	            "type":"Trip",
//	            "id":"58109fcef90fff07bfdca82e"
//	         },
//	         {
//	            "updatedAt":"2016-11-01T14:17:34.876Z",
//	            "createdAt":"2014-02-18T13:43:13.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Asset",
//	               "id":16924
//	            },
//	            "tripPlace":"5810a031f90fff07bfddcc1c",
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "extension":".jpg",
//	            "fileName":"58109fcef90fff07bfdca824",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "height":345,
//	            "width":630,
//	            "cover":false,
//	            "type":"TripPlace",
//	            "id":"58109fcef90fff07bfdca824"
//	         },
//	         {
//	            "updatedAt":"2016-11-01T14:17:34.879Z",
//	            "createdAt":"2014-02-18T13:40:42.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Asset",
//	               "id":16923
//	            },
//	            "tripPlace":"5810a031f90fff07bfddc013",
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "extension":".jpg",
//	            "fileName":"58109fcef90fff07bfdca82d",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "height":345,
//	            "width":630,
//	            "cover":false,
//	            "type":"TripPlace",
//	            "id":"58109fcef90fff07bfdca82d"
//	         },
//	         {
//	            "updatedAt":"2016-11-01T14:17:36.440Z",
//	            "createdAt":"2014-02-18T14:03:37.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Asset",
//	               "id":16927
//	            },
//	            "tripPlace":"5810a031f90fff07bfddc02b",
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "extension":".jpg",
//	            "fileName":"58109fcff90fff07bfdcbe2b",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "height":742,
//	            "width":1000,
//	            "cover":false,
//	            "type":"TripPlace",
//	            "id":"58109fcff90fff07bfdcbe2b"
//	         },
//	         {
//	            "updatedAt":"2016-11-01T14:17:36.440Z",
//	            "createdAt":"2014-02-18T13:55:46.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Asset",
//	               "id":16926
//	            },
//	            "tripPlace":"5810a031f90fff07bfddc066",
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "extension":".jpg",
//	            "fileName":"58109fcff90fff07bfdcbe2c",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "height":667,
//	            "width":1000,
//	            "cover":false,
//	            "type":"TripPlace",
//	            "id":"58109fcff90fff07bfdcbe2c"
//	         },
//	         {
//	            "updatedAt":"2016-11-01T14:17:36.441Z",
//	            "createdAt":"2014-02-18T13:50:13.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Asset",
//	               "id":16925
//	            },
//	            "tripPlace":"5810a031f90fff07bfddc327",
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "extension":".jpg",
//	            "fileName":"58109fcff90fff07bfdcbe2d",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "height":345,
//	            "width":630,
//	            "cover":false,
//	            "type":"TripPlace",
//	            "id":"58109fcff90fff07bfdcbe2d"
//	         }
//	      ],
//	      "quotesCount":0,
//	      "quotes":[
//
//	      ],
//	      "videosCount":0,
//	      "videos":[
//
//	      ],
//	      "tunesCount":0,
//	      "tunes":[
//
//	      ],
//	      "stepsCount":8,
//	      "steps":[
//	         {
//	            "updatedAt":"2017-05-24T01:01:26.101Z",
//	            "createdAt":"2014-02-18T04:52:43.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8555
//	            },
//	            "description":"Jump on bikes to see the Forbidden Purple Palace, royal tombs and nearby villages. Place the bikes on board a ‘Dragon Boat’, and enjoy a cruise up the Perfume River to visit the Thien Mu pagoda. Choose to either cycle back into town from here, approximately 8km, or staying on the boat to head back down river to the Citadel. Spend a couple of hours exploring Hue’s massive walled citadel and the Forbidden Purple Palace enclosed within. Alternatively, set off on an optional motorcycle tour of the sights in Hue and some surrounding villages!",
//	            "refId":"ChIJOQiSgjehQTERIp85_ECQZ4Y",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":16.461943,
//	               "lng":107.58542,
//	               "id":null
//	            },
//	            "picturesCount":9,
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"14 Le Lợi",
//	            "continent":"AS",
//	            "country":"VN",
//	            "city":"tp. Huế",
//	            "region":"Thừa Thiên Huế",
//	            "geometry":{
//	               "viewport":{
//	                  "southwest":{
//	                     "lng":107.5846991,
//	                     "lat":16.4617095
//	                  },
//	                  "northeast":{
//	                     "lng":107.5856603,
//	                     "lat":16.4626435
//	                  }
//	               },
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"5924db65ecb35e001b123133",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//	               "58109fcef90fff07bfdca82d"
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc013"
//	         },
//	         {
//	            "updatedAt":"2017-05-23T14:01:33.546Z",
//	            "createdAt":"2014-02-18T05:00:11.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8561
//	            },
//	            "description":"Optional trip with into the countryside to discover facets of rural life with a local site guide. Optional boat ride on Tonle Sap Lake, passing floating fishing villages. Kick back in Siem Reap and just wander around the town, visiting its market, shops and restaurants!",
//	            "refId":"ChIJyW2rzu8ZEDERkmA9jIecrvc",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":13.3313639,
//	               "lng":103.8343388,
//	               "id":null
//	            },
//	            "picturesCount":9,
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"Unnamed Road",
//	            "continent":"AS",
//	            "country":"KH",
//	            "region":"Siem Reap Province",
//	            "city":"Krong Siem Reap",
//	            "geometry":{
//	               "viewport":null,
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"592440bdac6a02001be25a43",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//	               "58109fcff90fff07bfdcbe2b"
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc02b"
//	         },
//	         {
//	            "updatedAt":"2017-05-23T19:41:59.689Z",
//	            "createdAt":"2014-02-18T04:58:02.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8559
//	            },
//	            "description":"Travel to Phnom Penh by public bus and take a cyclo sightseeing tour of Phnom Penh. Join a bus to visit the Royal Palace and reminders of the Khmer Rouge atrocities - the Choeung Ek Killing Fields and the infamous Tuol Sleng Genocide Museum. Visit the Central Market, located in an old French colonial building - a good place to look for clothing or sarongs! \r\n\r\nEnjoy the rest of the day exploring Phnom Penh city Perhaps stop by the temple of Wat Phnom, the National Museum and the French Quarter\r\nEnjoy a home-cooked meal in a family's home.",
//	            "refId":"ChIJT-Yvxj1RCTERYbhNXYpJ9QE",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":11.5589591,
//	               "lng":104.917671,
//	               "id":null
//	            },
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"Saint 113",
//	            "continent":"AS",
//	            "country":"KH",
//	            "city":"Phnom Penh",
//	            "region":"Phnom Penh",
//	            "geometry":{
//	               "viewport":null,
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"59249087ecb35e001b12301e",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc033"
//	         },
//	         {
//	            "updatedAt":"2017-06-20T07:24:19.478Z",
//	            "createdAt":"2014-02-18T04:51:56.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8554
//	            },
//	            "description":"Welcome to Hanoi! Begin by visiting the One Pillar Pagoda near the Soviet-inspired mausoleum of Ho Chi Minh. Walk to the Temple of Literature - Vietnam’s first educational institute. Visit the Hoa Lo Prison, probably better known to most as the ‘Hanoi Hilton’. Enjoy a free afternoon to wander around town and check out the lifestyles of Hanoi’s people. Perhaps stop by the city’s Old Quarter, situated to the north of the lake. Board the Reunification Express in the evening for the trip to Hue. \r\n",
//	            "refId":"ChIJcRICqb-rNTERi4cDwftb3Qw",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":21.033359,
//	               "lng":105.850127,
//	               "id":null
//	            },
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"18A Lương Văn Can",
//	            "continent":"AS",
//	            "country":"VN",
//	            "city":"Hanoi",
//	            "region":"Hà Nội",
//	            "geometry":{
//	               "viewport":{
//	                  "southwest":{
//	                     "lng":105.85007665,
//	                     "lat":21.03334259999999
//	                  },
//	                  "northeast":{
//	                     "lng":105.85020405,
//	                     "lat":21.03338419999999
//	                  }
//	               },
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"5924b3e1ecb35e001b12302d",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc04a"
//	         },
//	         {
//	            "updatedAt":"2017-06-20T17:50:27.491Z",
//	            "createdAt":"2014-02-18T04:56:10.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8557
//	            },
//	            "description":"Leave Hoi An and take the day train to Nha Trang. The term “fresh seafood lunch” takes on a new meaning after watching your crew catch, cook and serve it in front of you while cruising on the South China Sea. There’s plenty of time to swim and snorkel before getting back on the Reunification Express. \r\n\r\nEnjoy plenty of time to worship the sun during two full days in Nha Trang. Head out onto the water for a day to cruise around the islands\r\nSpend stacks of time swimming and snorkelling. Indulge in a lunchtime feast of freshly caught seafood and other delights for non-fish eaters\r\nBoard the Reunification Express for the final time and make our overnight journey to Ho Chi Minh City. ",
//	            "refId":"ChIJgyT1s3tncDERpibJAxMfElQ",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":12.2389693,
//	               "lng":109.1967084,
//	               "id":null
//	            },
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"Trần Phu",
//	            "continent":"AS",
//	            "country":"VN",
//	            "city":"tp. Nha Trang",
//	            "region":"Khánh Hòa",
//	            "geometry":{
//	               "viewport":null,
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"59496063682d92001b7be74c",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc052"
//	         },
//	         {
//	            "updatedAt":"2017-05-23T14:58:03.263Z",
//	            "createdAt":"2014-02-18T04:59:15.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8560
//	            },
//	            "description":"Put on your history hat and your exploring pants as we take a full day tour of Angkor Wat (spanning 220sqm and 600 years of history). We’ll throw in plenty of free time so you don’t get all templed-out. Leave Phnom Penh on a public bus and head towards Siem Reap\r\nWalk around town on an orientation of Siem Reap and enjoy some local snacks. \r\n\r\nTake an informative day-long tour of the Angkor complex, visiting the South Gate of Angkor Thom, Bayon, Elephant Terrace, Baphoun, the Royal Enclosure, Phimeanakas, Terrace of the Leper King, Ta Prohm and, of course, Angkor Wat. ",
//	            "refId":"ChIJyW2rzu8ZEDERkmA9jIecrvc",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":13.3313639,
//	               "lng":103.8343388,
//	               "id":null
//	            },
//	            "picturesCount":9,
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"Unnamed Road",
//	            "continent":"AS",
//	            "country":"KH",
//	            "region":"Siem Reap Province",
//	            "city":"Krong Siem Reap",
//	            "geometry":{
//	               "viewport":null,
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"592440bdac6a02001be25a43",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//	               "58109fcff90fff07bfdcbe2c"
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc066"
//	         },
//	         {
//	            "updatedAt":"2017-05-23T19:40:54.306Z",
//	            "createdAt":"2014-02-18T04:57:05.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8558
//	            },
//	            "description":"Wake to the sounds of frenzied activity this morning as the train rolls to a halt at Ho Chi Minh City\r\nChoose to make the most of your time, by hiring a ‘cyclo’ (bicycle rickshaw)\r\n\r\nCrawl through a section of the Cu Chi Tunnels. Learn how the brave men and women of Cu Chi built underground hospitals, kitchens and meeting rooms during their struggle. Spend the last afternoon in Vietnam shopping in the city’s main business district, or take a cyclo ride through the busy city streets to Ho Chi Minh City’s Chinatown district, Cholon.",
//	            "refId":"ChIJpaMnhWIpdTER0abQQNsV8o0",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":10.8233975,
//	               "lng":106.6299805,
//	               "id":null
//	            },
//	            "picturesCount":9,
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"14/2 Trường Chinh",
//	            "continent":"AS",
//	            "country":"VN",
//	            "city":"Ho Chi Minh City",
//	            "region":"Hồ Chí Minh",
//	            "geometry":{
//	               "viewport":{
//	                  "southwest":{
//	                     "lng":106.6298245,
//	                     "lat":10.8233832
//	                  },
//	                  "northeast":{
//	                     "lng":106.6300325,
//	                     "lat":10.823416
//	                  }
//	               },
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"59249046ecb35e001b12301d",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//	               "58109fcff90fff07bfdcbe2d"
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddc327"
//	         },
//	         {
//	            "updatedAt":"2017-05-23T13:45:03.499Z",
//	            "createdAt":"2014-02-18T04:53:33.000Z",
//	            "source":{
//	               "provider":"epiclist",
//	               "resource":"Step",
//	               "id":8556
//	            },
//	            "description":"Hoi An is like a living museum, minus the entry fee and fat security guard. There's an option to jump back on the bikes, so if you forgot to bring shorts just ask one of the same-day tailors to whip you up a spiffy new riding outfit. Enjoy a free morning to explore Hue under your own steam. \r\n\r\nTake an enjoyable four-hour drive to Hoi An in the afternoon, through a region of rural and coastal Vietnam. Pass through Lang Co Beach, and join Highway One through Hai Van Pass or, ‘Pass of the Ocean Clouds’. Drive through the busy streets of Danang and pass by the massive former US airbase that was, in 1968, the busiest airport in the world. \r\n\r\nWalk or perhaps rent bicycles and set off to explore the surrounding countryside, take a boat trip on the river, relax on the nearby beach, enjoy the cuisine on offer at some of the town’s numerous cheap cafes or have some clothes made up. Why not venture further afield to Vietnam’s world famous ‘China Beach’ (My Khe Beach) and the adjacent Marble Mountains. ",
//	            "refId":"ChIJYwB3ztYNQjERLmvAyDVCHVc",
//	            "transport":"car",
//	            "trip":"5810a003f90fff07bfdd193f",
//	            "location":{
//	               "lat":15.8807558,
//	               "lng":108.3382151,
//	               "id":null
//	            },
//	            "picturesCount":9,
//	            "traveller":"5810a042f90fff07bfde1ac9",
//	            "name":"8/3 Cửa Đại",
//	            "continent":"AS",
//	            "country":"VN",
//	            "city":"tp. Hội An",
//	            "region":"Quảng Nam",
//	            "geometry":{
//	               "viewport":{
//	                  "southwest":{
//	                     "lng":108.3381511,
//	                     "lat":15.8807483
//	                  },
//	                  "northeast":{
//	                     "lng":108.3384071,
//	                     "lat":15.8807583
//	                  }
//	               },
//	               "bounds":null
//	            },
//	            "position":0,
//	            "place":"59243cdfac6a02001be25a23",
//	            "spotsCount":0,
//	            "spots":[
//
//	            ],
//	            "pictures":[
//	               "58109fcef90fff07bfdca824"
//	            ],
//	            "info":{
//	               "country":{
//	                  "timezones":[
//
//	                  ],
//	                  "latlng":[
//
//	                  ],
//	                  "currencies":[
//
//	                  ],
//	                  "callingCodes":[
//
//	                  ],
//	                  "borders":[
//
//	                  ]
//	               }
//	            },
//	            "covers":[
//
//	            ],
//	            "id":"5810a031f90fff07bfddcc1c"
//	         }
//	      ],
//	      "likesCount":6,
//	      "likes":[
//	         "5810a041f90fff07bfde054c",
//	         "5810a042f90fff07bfde1381",
//	         "5810a041f90fff07bfddf69b",
//	         "570bdbdcd08ff10d0016a77a",
//	         "58f51b6ecf9d1b001b0a786e",
//	         "59cd6e441ec0c5001bfcc2e5"
//	      ],
//	      "travellersCount":1,
//	      "travellers":[
//	         {
//	            "picture":"58109fcef90fff07bfdcaf20",
//	            "name":{
//	               "first":"Fiona",
//	               "last":"Black",
//	               "full":"Fiona Black"
//	            },
//	            "id":"5810a042f90fff07bfde1ac9"
//	         }
//	      ],
//	      "featured":false,
//	      "plan":false,
//	      "distance":4446008,
//	      "duration":0,
//	      "id":"5810a003f90fff07bfdd193f"
//	   },
//	   "countries":[
//	      {
//	         "name":"Viet Nam",
//	         "alpha2Code":"VN",
//	         "alpha3Code":"VNM",
//	         "callingCodes":[
//	            "84"
//	         ],
//	         "capital":"Hanoi",
//	         "population":92700000,
//	         "latlng":[
//	            16.16666666,
//	            107.83333333
//	         ],
//	         "timezones":[
//	            "UTC+07:00"
//	         ],
//	         "currencies":[
//	            {
//	               "code":"VND",
//	               "name":"Vietnamese đồng",
//	               "symbol":"₫"
//	            }
//	         ],
//	         "nativeName":"Việt Nam",
//	         "area":331212,
//	         "continent":"AS"
//	      },
//	      {
//	         "name":"Cambodia",
//	         "alpha2Code":"KH",
//	         "alpha3Code":"KHM",
//	         "callingCodes":[
//	            "855"
//	         ],
//	         "capital":"Phnom Penh",
//	         "population":15626444,
//	         "latlng":[
//	            13,
//	            105
//	         ],
//	         "timezones":[
//	            "UTC+07:00"
//	         ],
//	         "currencies":[
//	            {
//	               "code":"KHR",
//	               "name":"Cambodian riel",
//	               "symbol":"៛"
//	            },
//	            {
//	               "code":"USD",
//	               "name":"United States dollar",
//	               "symbol":"$"
//	            }
//	         ],
//	         "nativeName":"Kâmpŭchéa",
//	         "area":181035,
//	         "continent":"AS"
//	      }
//	   ]
//	}