package net.ludocrypt.nbexpand;

import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NoteblockSounds {

	private static final Map<Identifier, SoundEvent> SOUND_EVENTS = new LinkedHashMap<>();

	public static final SoundEvent MUSIC_BOX = add("noteblock.new.note.music_box");
	public static final SoundEvent PIANO = add("noteblock.new.note.piano");
	public static final SoundEvent SITAR = add("noteblock.new.note.sitar");
	public static final SoundEvent VIBRAPHONE = add("noteblock.new.note.vibraphone");
	public static final SoundEvent BASSDRUM = add("noteblock.new.note.bassdrum");
	public static final SoundEvent CELESTA = add("noteblock.new.note.celesta");
	public static final SoundEvent GLOCKENSPIEL = add("noteblock.new.note.glockenspiel");
	public static final SoundEvent HARPSICHORD = add("noteblock.new.note.harpsichord");
	public static final SoundEvent HIGHDRUM = add("noteblock.new.note.highdrum");
	public static final SoundEvent MARIMBA = add("noteblock.new.note.marimba");
	public static final SoundEvent STEELDRUMS = add("noteblock.new.note.steeldrums");
	public static final SoundEvent TIMPANI = add("noteblock.new.note.timpani");
	public static final SoundEvent WOODBLOCKS = add("noteblock.new.note.woodblocks");
	public static final SoundEvent CHINESE_PIK = add("noteblock.new.note.chinese_pik");
	public static final SoundEvent PLUCK = add("noteblock.new.note.pluck");
	public static final SoundEvent TRUMPET = add("noteblock.new.note.trumpet");
<<<<<<<<< Temporary merge branch 1

=========
	public static final SoundEvent SAXOPHONE = add("noteblock.new.note.saxophone");
	public static final SoundEvent ORGAN = add("noteblock.new.note.organ");
	public static final SoundEvent VIOLIN = add("noteblock.new.note.violin");
	public static final SoundEvent CYMBAL = add("noteblock.new.note.cymbal");
	public static final SoundEvent ELECTRIC_GUITAR = add("noteblock.new.note.electric_guitar");
	public static final SoundEvent CELLO = add("noteblock.new.note.cello");
	private static SoundEvent add(String id) {
		Identifier realId = NoteblockExpansion.id(id);
		SoundEvent S = new SoundEvent(realId);
		SOUND_EVENTS.put(realId, S);
		return S;
	}

	public static void init() {
		for (Identifier id : SOUND_EVENTS.keySet()) {
			Registry.register(Registry.SOUND_EVENT, id, SOUND_EVENTS.get(id));
		}

	}
}
