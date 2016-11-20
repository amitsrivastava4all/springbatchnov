package com.srivastava.basics;

public class Helper {
	MessageDTO messageDTO ;
	public MessageDTO login(LoginDTO loginDTO){
		if(loginDTO.getUserid().equals(loginDTO.getPassword())){
			messageDTO.setMessage("Welcome "+loginDTO.getUserid());
			messageDTO.setStatus("success");
		}
		else
		{
			messageDTO.setMessage("Invalid Userid or Password ");
			messageDTO.setStatus("failure");
		}
		return this.messageDTO;
	}
	public MessageDTO getMessageDTO() {
		return messageDTO;
	}
	public void setMessageDTO(MessageDTO messageDTO) {
		this.messageDTO = messageDTO;
	}
	
	
}
