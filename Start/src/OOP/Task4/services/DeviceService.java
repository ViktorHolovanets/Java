package OOP.Task4.services;

import OOP.Task4.models.Device;

public class DeviceService {
    public Device device;
    public DeviceService(Device device){
        this.device=device;
    }
    public  void ShowDevice(){
        device.Show();
    }
    public void SoundDevice(){
        device.Sound();
    }
    public void DescDevice(){
        device.Desc();
    }
}
