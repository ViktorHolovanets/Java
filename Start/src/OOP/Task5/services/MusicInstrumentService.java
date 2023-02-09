package OOP.Task5.services;

import OOP.Task5.models.baseClasses.MusicInstrument;

public class MusicInstrumentService {
    public  static void ShowDevice(MusicInstrument device){
        device.Show();
    }
    public  static void SoundDevice(MusicInstrument device){
        device.Sound();
    }
    public  static void DescDevice(MusicInstrument device){
        device.Desc();
    }
}
