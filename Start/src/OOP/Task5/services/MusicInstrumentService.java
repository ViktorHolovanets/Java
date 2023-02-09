package OOP.Task5.services;

import OOP.Task5.models.baseClasses.MusicInstrument;

public class MusicInstrumentService {
    private MusicInstrument musicInstrument;

    public MusicInstrumentService(MusicInstrument musicInstrument) {
        this.musicInstrument = musicInstrument;
    }

    public void ShowDevice() {
        musicInstrument.Show();
    }

    public void SoundDevice() {
        musicInstrument.Sound();
    }

    public void DescDevice() {
        musicInstrument.Desc();
    }
}
