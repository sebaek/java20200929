package chap09.textbook.exercises.p06;



public class Chatting {
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		final String nickNamecopy = nickName;
		Chat chat = new Chat() {
			@Override
			void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickNamecopy + "]" + inputData;
					sendMessage(message);
				}
			}
		};
	}
}




