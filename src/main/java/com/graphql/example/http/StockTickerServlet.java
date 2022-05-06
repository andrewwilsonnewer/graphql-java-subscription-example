package com.graphql.example.http;


import org.eclipse.jetty.websocket.server.JettyWebSocketServlet;
import org.eclipse.jetty.websocket.server.JettyWebSocketServletFactory;

import java.time.Duration;

/**
 * In Jetty this is how you map a servlet to a websocket per request
 */
class StockTickerServlet extends JettyWebSocketServlet {

    @Override
    protected void configure(JettyWebSocketServletFactory factory) {
        factory.setMaxTextMessageSize(1024 * 1024);
        factory.setIdleTimeout(Duration.ofSeconds(30));
        factory.register(StockTickerWebSocket.class);
    }
}


