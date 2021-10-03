package com.te.assignments2;

public class TypeCastingMobileTest {

	public static void main(String[] args) {
		
		TypeCastingMobile mobile=new MicroPhone();//UpCasting:microphone--->Mobile
		mobile.features();//Avialable Features
		
		Camera cam=(Camera)mobile;//DownCasting:Mobile-->Camera
		cam.features();//Available Features
		cam.takePhotos();//Take Selfies
		cam.vedioCall();//Vedio Call
		
		MicroPhone Mi=(MicroPhone)cam;//DownCasting:Camera--->MicroPhone
		Mi.features();//Avalable Features
		Mi.takePhotos();//Take Selfies
		Mi.vedioCall();//Vedio Call
		Mi.recordAudio();//Record audio
		
		
		MicroPhone micro=(MicroPhone)mobile;//DownCasting:Mobile--->MicroPhone
		micro.features();//Avalable Features
		micro.takePhotos();//Take Selfies
		micro.vedioCall();//Vedio Call
		micro.recordAudio();//Record audio
		
	}
}
