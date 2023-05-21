public class OfficerModusPonensTollensEvent extends Thrower {

  public OfficerModusPonensTollensEvent() {
    super();

    strings.add("You're out.");
    strings.add("");
    strings.add("The streets.");
    strings.add("It's moisty, it's dirty and there's a lot of people.");
    strings.add("");
    strings.add("You just got \"random\" checked by a police patrol.");
    strings.add("They seem suspicious. And they're about to call-in.");

    for (Resource resource : Reg.resources) {
      if (resource.nature == ResourceNature.Spiritual) {
        choices.add(new Choice(
          "Mind blast them (2 " + resource.name + ")",
          mindBlast,
          resource
        ));
      }
    }

    if (Reg.cards.exists("weapon") && Reg.cards.get("weapon") >= 1) {
      choices.add(new Choice("Stab them", stab));
    }

    choices.add(new Choice("Beat 'em up", beat));
    choices.add(new Choice("Try to run", run));
  }

  private void getArrested() {
    Reg.end = "Four Walls";
    Reg.endSentences = [
      "You have been stopped, in plain momentum.",
      "It's a pity.",
      "You played and you lost.",
      "",
      "You should have been more vigilant.",
    ];
  }

  private void mindBlast(Resource resource) {
    if (resource.quantity >= 2) {
      resource.quantity -= 2;
      Reg.cards.set("wanted", Reg.cards.get("wanted") - 1);
      Reg.event = null;
      FlxG.switchState(new LocationState());
    }
  }

  private void stab(Resource resource) {
    if (Reg.cards.exists("weapon") && Reg.cards.get("weapon") >= 1) {
      Reg.cards.set("chaos", Reg.cards.get("chaos") + 1);
      Reg.cards.set("wanted", Reg.cards.get("wanted") + 1);
      Reg.event = null;
      FlxG.switchState(new LocationState());
    }
  }

  private void beat(Resource resource) {
    if (FlxRandom.int() % 3 != 0) {
      Reg.cards.set("wanted", Reg.cards.get("wanted") + 1);
      Reg.event = null;
      FlxG.switchState(new LocationState());
    } else {
      getArrested();
      FlxG.switchState(new EndState());
    }
  }

  private void run(Resource resource) {
    if (FlxRandom.int() % 2 == 0) {
      Reg.event = null;
      FlxG.switchState(new LocationState());
    } else {
      getArrested();
      FlxG.switchState(new EndState());
    }
  }
}
