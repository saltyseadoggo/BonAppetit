package net.bonappetit.common;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class DiscItem extends MusicDiscItem {
    public DiscItem(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings);
    }
}
