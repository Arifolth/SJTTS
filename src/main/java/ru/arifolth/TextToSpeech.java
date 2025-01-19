/**
 *     SJTTS Simple Java Text To Speech program.
 *
 *     Copyright (C) 2025 Alexander Nilov
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package ru.arifolth;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech {
    private Voice voice;

    public TextToSpeech(){
        voice = VoiceManager.getInstance().getVoice("kevin16");
        if (voice == null) {
            throw new RuntimeException("Cannot find the 'kevin' voice.");
        }
        // This will not return until TTS has been quit
        voice.allocate();
    }

    public void speak(String text){
        voice.speak(text);
    }
}
