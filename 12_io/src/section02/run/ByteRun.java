package section02.run;

import section02.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		ByteService service = new ByteService();
				
//		service.fileByteOutput();				// 파일 출력
//		service.bufferedFileByteOutput();		//
				
//		service.fileByteInput();				// 한글 깨짐
//		service.fileByteInput2();				// 한글 안 깨짐
		
//		service.bufferedFileByteInput();		// 효율 좋음
		
		service.fileCopy();
		
	}
}
