### Upgrades

- [x] Java 8 -> 17
- [x] Gradle -> Kotlin Gradle (to support Java)
- [x] GraphQL 6 -> 18 (json now contains the calling name)
- [x] Jetty 9 -> 11 (websocket needed to change)
- [x] rxjava2:2.1.5 -> rxjava3:3.1.4 (transparent)
- [x] slf4j-simple 1.7.22 -> 2.0.0 (transparent)
- [x] gson 2.8.0 -> 2.9.0 (transparent)
- [x] jackson-databind 2.8.8.1 -> 2.13.2.2
- [x] okhttp3, junit, spock, groovy (removed since unused)


### GraphQL
#### Version 6.0
`{"dateTime":"2022-05-05T14:23:04.351433","stockCode":"TEAM","stockPrice":40.49,"stockPriceChange":0.85}`

#### Version 18.2
`{"stockQuotes":{"dateTime":"2022-05-05T14:21:15.505626","stockCode":"IBM","stockPrice":165.59,"stockPriceChange":1.24}}`

## Jetty

Good explanation here https://stackoverflow.com/questions/65443271/set-up-websockets-with-jetty-11


