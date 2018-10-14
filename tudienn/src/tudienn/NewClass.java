/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudienn;
import com.sun.speech.freetts.Age;
import com.sun.speech.freetts.VoiceManager;
/**
 *
 * @author thinhnguyen
 */
public class NewClass {
    public static void speech(String text){
        VoiceManager voiceManager = VoiceManager.getInstance();
        com.sun.speech.freetts.Voice sVoice = voiceManager.getVoice("kevin16");
        sVoice.allocate();
        sVoice.speak(text);
        sVoice.deallocate();
    }
    public static void main(String[] args) {
        speech("hello how i you");
    }
}
