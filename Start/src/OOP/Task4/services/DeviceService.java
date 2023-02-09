package OOP.Task4.services;

import OOP.Task4.models.Device;

public class DeviceService {
    public  static void ShowDevice(Device device){
        device.Show();
    }
    public  static void SoundDevice(Device device){
        device.Sound();
    }
    public  static void DescDevice(Device device){
        device.Desc();
    }
}
