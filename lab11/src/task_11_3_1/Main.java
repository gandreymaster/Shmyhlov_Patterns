package task_11_3_1;

public class Main {

    public static void main(String[] args) {
        String fileName = "testvideo.ogg";
        VideoFile videoFile = new VideoFile(fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio"));
        videoFile.play(new MPEG4CompressionCodec());
        VideoConversionFacade facade = new VideoConversionFacade();
        Codec destinationCodec = new MPEG4CompressionCodec();
        VideoFile videoFileConverted = facade.convert(videoFile, destinationCodec);
        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}
