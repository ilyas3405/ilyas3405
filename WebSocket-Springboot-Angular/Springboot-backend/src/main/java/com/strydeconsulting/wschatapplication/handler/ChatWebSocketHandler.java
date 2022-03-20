package com.strydeconsulting.wschatapplication.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler {

	private final List<WebSocketSession> websocketSessions = new ArrayList<>();
	
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		websocketSessions.add(session);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside ChatWebSocketHandler::handleTextMessage Method::UserTextMessage-->" +message );
		for (WebSocketSession webSocketSession : websocketSessions) {
			webSocketSession.sendMessage(message);
		}
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		// TODO Auto-generated method stub
		websocketSessions.remove(session);
	}
}
