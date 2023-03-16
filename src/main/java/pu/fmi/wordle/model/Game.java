package pu.fmi.wordle.model;

import java.time.LocalDateTime;
import java.util.List;

public class Game {

  String id;
  String word;
  LocalDateTime startedOn;
  String alphabet = "абвгдежзийклмнопрстуфхцчшщъьюя";
  String alphabetMatches;

  int maxGuesses = 6;
  int currentGuesses = 0;
  boolean isWordGuessed = false;
  List<Guess> guesses;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public LocalDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(LocalDateTime startedOn) {
    this.startedOn = startedOn;
  }

  public int getMaxGuesses() {
    return maxGuesses;
  }

  public void setMaxGuesses(int maxGuesses) {
    this.maxGuesses = maxGuesses;
  }
  
  public int getCurrentGuesses() {
	return currentGuesses;
  }

  public void setCurrentGuesses(int currentGuesses) {
	this.currentGuesses = currentGuesses;
  }
  
  public boolean isWordGuessed() {
	return isWordGuessed;
  }

  public void setWordGuessed(boolean isWordGuessed) {
	this.isWordGuessed = isWordGuessed;
  }

  public List<Guess> getGuesses() {
    return guesses;
  }

  public void setGuesses(List<Guess> guesses) {
    this.guesses = guesses;
  }

  public String getAlphabet() {
    return alphabet;
  }

  public void setAlphabet(String alphabet) {
    this.alphabet = alphabet;
  }

  public String getAlphabetMatches() {
    return alphabetMatches;
  }

  public void setAlphabetMatches(String alphabetMatches) {
    this.alphabetMatches = alphabetMatches;
  }
}
