package fr.istic.aoc.channel;

import java.util.concurrent.Future;

public interface GeneratorAsync {
	 Future<Integer> getValue();
}
