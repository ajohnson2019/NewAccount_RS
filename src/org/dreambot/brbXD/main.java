package org.dreambot.brbXD;

import java.awt.Point;

import org.dreambot.api.Client;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.container.impl.bank.BankMode;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.methods.quest.Quest;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.methods.tabs.Tab;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.items.GroundItem;
import org.dreambot.api.wrappers.items.Item;
import org.dreambot.api.wrappers.widgets.WidgetChild;

@ScriptManifest(category = Category.MISC, name = "newaccountBRB", author = "BrbXD", version = 1)
public class main extends AbstractScript {
	Area startZone = new Area(3220, 3234, 3239, 3212, 0);
	Area instructorArea = new Area(3214, 3242, 3223, 3235, 0);
	Tile lummyCastleTile = new Tile(3206, 3228, 0);
	Area lummyCastleStairs = new Area(3204, 3330, 3208, 3227, 0);
	Area lummyBankArea = new Area(3208, 3220, 3209, 3218, 2);
	Area chickenArea = new Area(3172, 3301, 3183, 3289, 0);
	Area wcArea = new Area(3112, 3307, 3123, 3299, 0);
	Area draynorBankArea = new Area(3092, 3245, 3093, 3242, 0);
	Area fmArea = new Area(3122, 3520, 3126, 3518, 0);
	Tile fmTile = new Tile(3125, 3520, 0);
	Tile fmTile2 = new Tile(3125, 2519, 0);
	Area edgeBankArea = new Area(3095, 3495, 3097, 3494, 0);
	Area fishArea = new Area(3265, 3150, 3279, 3138, 0);
	Area desertBankArea = new Area(3269, 3169, 3271, 3166, 0);
	Tile miningTile = new Tile(3286, 3361, 0);
	Area miningBankArea = new Area(3251, 3421, 3254, 3420, 0);
	Area cookArea = new Area(3272, 3181, 3273, 3180, 0);
	Area geArea = new Area(3161, 3492, 3168, 3485, 0);

	Area eggArea = new Area(3226, 3300, 3229, 3298, 0);
	Area milkArea = new Area(3255, 3273, 3256, 3271, 0);
	Area wheatArea = new Area(3160, 3294, 3162, 3293, 0);
	Area outsideMillArea = new Area(3166, 3302, 3167, 3301, 0);
	Area insideMillArea = new Area(3166, 3305, 3167, 3304, 0);
	Area fredsShedArea = new Area(3188, 3274, 3191, 3271, 0);
	Area sheepArea = new Area(3194, 3275, 3211, 3257, 0);
	Area woolSpot = new Area(3209, 3215, 3209, 3213, 1);
	Area cookSpot = new Area(3209, 3215, 3209, 3213, 0);
	Area stairSpot = new Area(3205, 3209, 3206, 3208, 0);

	Area cadavaArea = new Area(3267, 3371, 3269, 3369, 0);
	Area varrockSquare = new Area(3208, 3425, 3214, 3423, 0);
	Area outsideJuliet = new Area(3165, 3434, 3167, 3432, 0);
	boolean breakAttack = true;
	boolean breakStrength = true;
	boolean breakDefence = true;
	boolean noShrimps = false;
	boolean noAnchovies = false;
	boolean logCheck = true;
	int fmSpot = 0;

	@Override
	public int onLoop() {
		// if (getSkills().getRealLevel(Skill.ATTACK) < 25 &&
		// getSkills().getRealLevel(Skill.STRENGTH) < 26
		// && getSkills().getRealLevel(Skill.DEFENCE) < 25) {
		// while (getSkills().getRealLevel(Skill.ATTACK) < 25 &&
		// getSkills().getRealLevel(Skill.STRENGTH) < 26
		// && getSkills().getRealLevel(Skill.DEFENCE) < 25
		// && Client.getClient().getInstance().getScriptManager().isRunning()) {
		// Combat();
		// }
		// }
		// if (getSkills().getRealLevel(Skill.ATTACK) == 25) {
		// getTabs().logout();
		// sleep(5000, 10000);
		// stop();
		// }
		// if (getSkills().getTotalLevel() == 32 &&
		// !getEquipment().contains("Bronze sword")) {
		// Prep();
		// }
		// getTabs().open(Tab.QUEST);
		// sleepUntil(() -> getTabs().isOpen(Tab.QUEST), 4000);
		// if (!getQuests().isFinished(Quest.COOKS_ASSISTANT) ||
		// !getQuests().isFinished(Quest.SHEEP_SHEARER)) {
		// log("Hello");
		// FirstQuesting();
		// }
		// getTabs().open(Tab.INVENTORY);
		// // if (getSkills().getRealLevel(Skill.ATTACK) < 25 &&
		// // getSkills().getRealLevel(Skill.STRENGTH) < 26
		// // && getSkills().getRealLevel(Skill.DEFENCE) < 25) {
		// // while (getSkills().getRealLevel(Skill.ATTACK) < 25 &&
		// // getSkills().getRealLevel(Skill.STRENGTH) < 26
		// // && getSkills().getRealLevel(Skill.DEFENCE) < 25
		// // &&
		// Client.getClient().getInstance().getScriptManager().isRunning()) {
		// // Combat();
		// // }
		// // }
		// if (getSkills().getRealLevel(Skill.FISHING) < 30) {
		// Fishing();
		// }
		// if (getSkills().getRealLevel(Skill.MINING) < 30) {
		// Mining();
		// }
		// if (getSkills().getRealLevel(Skill.COOKING) < 30) {
		// Cooking();
		// }
		// if (getSkills().getRealLevel(Skill.WOODCUTTING) < 30) {
		// while (getSkills().getRealLevel(Skill.WOODCUTTING) < 30
		// && Client.getClient().getInstance().getScriptManager().isRunning()) {
		// log("In woodcutting");
		// Woodcutting();
		// }
		// }
		if (logCheck == true) {
			Firemaking();
		}
		// GrandExchange();
		// SecondQuesting();
		// getTabs().logout();
		// sleep(1000, 2000);
		// stop();
		return 500;
	}

	private void SecondQuesting() {
		while (!getQuests().isFinished(Quest.ROMEO_AND_JULIET)
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			if (!getInventory().contains("Cadava berries") && !getQuests().isStarted(Quest.ROMEO_AND_JULIET)) {
				while (!cadavaArea.contains(getLocalPlayer())
						&& Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(cadavaArea.getRandomTile());
					sleepUntil(() -> cadavaArea.contains(getLocalPlayer()), 2350);
				}
				if (cadavaArea.contains(getLocalPlayer())) {
					GameObject berries = getGameObjects()
							.closest(b -> b != null && b.getID() == 23625 && cadavaArea.contains(b));
					berries.interact("Pick-from");
					sleepUntil(() -> getInventory().contains("Cadava berries"), 10000);
				}
			}
			if (getInventory().contains("Cadava berries") && !getQuests().isStarted(Quest.ROMEO_AND_JULIET)) {
				while (!varrockSquare.contains(getLocalPlayer())
						&& Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(varrockSquare.getRandomTile());
					sleepUntil(() -> varrockSquare.contains(getLocalPlayer()), 2350);
				}
				if (varrockSquare.contains(getLocalPlayer())) {
					NPC romeo = getNpcs().closest("Romeo");
					romeo.interact("Talk-to");
					sleepUntil(() -> getDialogues().inDialogue(), 5000);
					if (getDialogues().inDialogue()) {
						getDialogues().continueDialogue();
						sleep(5000, 8000);
						getDialogues().chooseOption(3);
						sleep(5000, 8000);
						for (int i = 0; i <= 10; i++) {
							getDialogues().continueDialogue();
							sleep(5000, 8000);
						}
						getDialogues().chooseOption(1);
						sleep(5000, 8000);
						for (int i = 0; i <= 2; i++) {
							getDialogues().continueDialogue();
							sleep(5000, 8000);
							getDialogues().continueDialogue();
							sleep(5000, 8000);
						}
					}
				}
			}
			if (getQuests().isStarted(Quest.ROMEO_AND_JULIET) && getInventory().contains("Cadava berries")) {
				while (!outsideJuliet.contains(getLocalPlayer())
						&& Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(outsideJuliet.getRandomTile());
					sleepUntil(() -> outsideJuliet.contains(getLocalPlayer()), 2350);
				}
				GameObject door = getGameObjects().closest("Door");
				if (door != null && door.hasAction("Open")) {
					door.interact("Open");
					sleep(3000, 5000);
				}
				GameObject staircase = getGameObjects().closest("Staircase");
				// if (staircase != null) {
				log("Henlo");
				door.interact("Climb-up");
				sleep(3000, 5000);
				// }
				Area insideJuliet = new Area(3156, 3432, 3158, 3430, 1);
				getWalking().walkOnScreen(insideJuliet.getRandomTile());
				sleepUntil(() -> insideJuliet.contains(getLocalPlayer()), 10000);
				GameObject door2 = getGameObjects().closest("Door");
				if (door2 != null) {
					door2.interact("Open");
				}
			}
		}
	}

	private void FirstQuesting() {
		while (!getQuests().isFinished(Quest.COOKS_ASSISTANT) || !getQuests().isFinished(Quest.SHEEP_SHEARER)
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			if (!getQuests().isFinished(Quest.COOKS_ASSISTANT)) {
				if (!getInventory().contains("Egg")) {
					while (!eggArea.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(eggArea.getRandomTile());
						sleep(2250, 3000);
					}
					GroundItem egg = getGroundItems().closest("Egg");
					if (egg != null) {
						egg.interact("Take");
					}
					sleepUntil(() -> getInventory().contains("Egg"), 4000);
				}
				if (!getInventory().contains("Bucket of milk")) {
					while (!milkArea.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(milkArea.getRandomTile());
						sleepUntil(() -> milkArea.contains(getLocalPlayer()), 3000);
					}

					GameObject dairyCow = getGameObjects().closest("Dairy cow");
					if (dairyCow != null) {
						dairyCow.interact("Milk");
					}
					sleepUntil(() -> getInventory().contains("Bucket of milk"), 4000);
				}
				if (!getInventory().contains("Pot of flour")) {
					if (!getInventory().contains("Grain")) {
						while (!wheatArea.contains(getLocalPlayer())
								&& Client.getClient().getInstance().getScriptManager().isRunning()) {
							getWalking().walk(wheatArea.getRandomTile());
							sleep(2250, 2500);
						}
						GameObject wheat = getGameObjects().closest("Wheat");
						if (wheat != null) {
							wheat.interact("Pick");
						}
						sleepUntil(() -> getInventory().contains("Grain"), 4000);
					}

					while (!outsideMillArea.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(outsideMillArea.getRandomTile());
						sleepUntil(() -> outsideMillArea.contains(getLocalPlayer()), 3000);
					}
					GameObject largeDoors = getGameObjects().closest("Large door");
					if (largeDoors != null && largeDoors.hasAction("Open")) {
						largeDoors.interact("Open");
						sleepUntil(() -> largeDoors.hasAction("Close"), 3000);
					}

					GameObject ladder = getGameObjects().closest("Ladder");
					GameObject flourBin = getGameObjects().closest("Flour Bin");
					if (ladder != null) {
						ladder.interact("Climb-up");
						sleep(5000, 8000);
					}
					GameObject ladder2 = getGameObjects().closest("Ladder");
					if (ladder2 != null) {
						ladder2.interact("Climb-up");
						sleep(5000, 8000);
					}
					GameObject hopper = getGameObjects().closest("Hopper");
					GameObject hopperControls = getGameObjects().closest("Hopper controls");
					if (hopper != null) {
						Item grain = getInventory().get("Grain");
						grain.useOn(hopper);
						sleep(5000, 8000);
					}
					if (hopperControls != null) {
						hopperControls.interact("Operate");
						sleep(5000, 8000);
					}
					GameObject ladder3 = getGameObjects().closest("Ladder");
					if (ladder3 != null) {
						ladder3.interact("Climb-down");
						sleep(5000, 8000);
					}
					GameObject ladder4 = getGameObjects().closest("Ladder");
					if (ladder4 != null) {
						ladder4.interact("Climb-down");
						sleep(4000, 5000);
					}
					while (!insideMillArea.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(insideMillArea.getRandomTile());
						sleepUntil(() -> insideMillArea.contains(getLocalPlayer()), 3000);
					}
					if (flourBin != null) {
						flourBin.interact("Empty");
						sleepUntil(() -> getInventory().contains("Pot of flour"), 4000);
					}
					if (largeDoors != null && largeDoors.hasAction("Open")) {
						largeDoors.interact("Open");
						sleepUntil(() -> largeDoors.hasAction("Close"), 3000);
					}
				}
				if (!getInventory().contains("Shears")) {
					while (!fredsShedArea.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(fredsShedArea.getRandomTile());
						sleepUntil(() -> fredsShedArea.contains(getLocalPlayer()), 2000);
					}
					GroundItem shears = getGroundItems().closest("Shears");
					shears.interact("Take");
					sleepUntil(() -> getInventory().contains("Shears"), 4000);
				}
				if (getInventory().contains("Shears") && getInventory().count("Wool") != 20
						&& !getInventory().contains("Ball of wool")) {
					while (!sheepArea.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(sheepArea.getRandomTile());
						sleepUntil(() -> sheepArea.contains(getLocalPlayer()), 2300);
					}
				}
				if (getInventory().count("Wool") < 20 && !getInventory().contains("Ball of wool")) {
					while (getInventory().count("Wool") < 20
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						if (!sheepArea.contains(getLocalPlayer())) {
							while (!sheepArea.contains(getLocalPlayer())
									&& Client.getClient().getInstance().getScriptManager().isRunning()) {
								getWalking().walk(sheepArea.getRandomTile());
								sleepUntil(() -> sheepArea.contains(getLocalPlayer()), 2300);
							}
						}
						if (sheepArea.contains(getLocalPlayer())
								&& Client.getClient().getInstance().getScriptManager().isRunning()) {
							if (getLocalPlayer().isInCombat()) {
								sleepUntil(() -> !getLocalPlayer().isInCombat(), 30000);
							}
							NPC sheep = getNpcs().closest(npc -> npc != null && npc.getName().equals("Sheep")
									&& npc.hasAction("Shear") && npc.getID() != 731 && sheepArea.contains(npc)
									&& (npc.getID() == 2802 || npc.getID() == 2795 || npc.getID() == 2800
											|| npc.getID() == 2794));
							if (sheep != null && sheep.getID() != 731 && sheep.hasAction("Shear")) {
								sheep.interact("Shear");
							}
							sleepUntil(() -> getLocalPlayer().getAnimation() == 893, 2000);
							sleep(500, 1000);
						}
					}
				}
				if (getInventory().count("Wool") == 20) {
					if (!stairSpot.contains(getLocalPlayer())) {
						while (!stairSpot.contains(getLocalPlayer())
								&& Client.getClient().getInstance().getScriptManager().isRunning()) {
							getWalking().walk(stairSpot.getRandomTile());
							sleep(2250, 3000);
						}
					}
					if (stairSpot.contains(getLocalPlayer()) && getInventory().count("Wool") == 20) {
						GameObject stairs = getGameObjects()
								.closest(gameObject -> gameObject != null && gameObject.hasAction("Climb-up"));
						stairs.interact("Climb-up");
						sleep(5000, 8000);
						while (!woolSpot.contains(getLocalPlayer())
								&& Client.getClient().getInstance().getScriptManager().isRunning()) {
							getWalking().walk(woolSpot.getRandomTile());
							sleep(2250, 3000);
						}
					}

				}
				if (woolSpot.contains(getLocalPlayer()) && getInventory().contains("Wool")) {
					GameObject spinningWheel = getGameObjects().closest("Spinning wheel");
					if (spinningWheel != null) {
						spinningWheel.interact("Spin");
						sleep(Calculations.random(5000, 8000));
						WidgetChild x = getWidgets().getWidget(270).getChild(14);
						if (x != null) {
							x.interact();
							sleepUntil(() -> !getInventory().contains("Wool"), 80000);
						}
					}
				}
				// WORK ON THIS!!!!!!!!!!
				if (getInventory().contains("Egg") && getInventory().contains("Pot of flour")
						&& getInventory().contains("Bucket of milk")) {
					log("Hello");
					while (!cookSpot.contains(getLocalPlayer())
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						getWalking().walk(cookSpot.getRandomTile());
						sleep(2250, 3000);
					}
					if (cookSpot.contains(getLocalPlayer())) {
						NPC cook = getNpcs().closest("Cook");
						cook.interact("Talk-to");
						sleepUntil(() -> getDialogues().inDialogue(), 6000);
						getDialogues().continueDialogue();
						sleep(3000, 5000);
						getDialogues().chooseOption(1);
						sleep(3000, 5000);
						for (int j = 0; j <= 3; j++) {
							getDialogues().spaceToContinue();
							sleep(3000, 5000);
						}
						getDialogues().chooseOption(1);
						sleep(3000, 5000);
						getDialogues().spaceToContinue();
						sleep(3000, 5000);
						cook.interact("Talk-to");
						sleep(3000, 5000);
						for (int i = 0; i <= 9; i++) {
							getDialogues().spaceToContinue();
							sleep(3000, 5000);
						}
					}
				}
			}
			if (getInventory().count("Ball of wool") == 20 && !fredsShedArea.contains(getLocalPlayer())) {
				while (!fredsShedArea.contains(getLocalPlayer())
						&& Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(fredsShedArea.getRandomTile());
					sleepUntil(() -> fredsShedArea.contains(getLocalPlayer()), 2000);
				}
			}
			if (fredsShedArea.contains(getLocalPlayer())) {
				NPC fredFarmer = getNpcs().closest("Fred the Farmer");
				fredFarmer.interact("Talk-to");
				sleepUntil(() -> getDialogues().inDialogue(), 5000);
				getDialogues().continueDialogue();
				sleep(5000, 8000);
				getDialogues().chooseOption(1);
				sleep(5000, 8000);
				for (int j = 0; j <= 4; j++) {
					getDialogues().continueDialogue();
					sleep(5000, 8000);
				}
				getDialogues().chooseOption(1);
				sleep(5000, 8000);
				for (int i = 0; i <= 10; i++) {
					getDialogues().continueDialogue();
					sleep(5000, 8000);
				}
			}
		}
	}

	private void GrandExchange() {
		while (!geArea.contains(getLocalPlayer()) && Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(geArea.getRandomTile());
			sleepUntil(() -> geArea.contains(getLocalPlayer()), 2250);
		}
		if (geArea.contains(getLocalPlayer()) && !getInventory().contains("Shrimps")) {
			NPC banker = getNpcs().closest("Banker");
			while (!getBank().isOpen()) {
				if (banker != null) {
					banker.interact("Bank");
					sleepUntil(() -> getBank().isOpen(), 4000);
				}
			}
		}
		if (getBank().isOpen()) {
			if (getBank().getCurrentWithdrawMode() == BankMode.ITEM) {
				getBank().setWithdrawMode(BankMode.NOTE);
				sleep(500, 1500);
			}
			getBank().withdrawAll("Copper ore");
			sleepUntil(() -> getInventory().contains("Copper ore"), 4000);
			getBank().withdrawAll("Anchovies");
			sleepUntil(() -> getInventory().contains("Anchovies"), 4000);
			getBank().withdrawAll("Shrimps");
			sleepUntil(() -> getInventory().contains("Shrimps"), 4000);

			getBank().close();
			sleepUntil(() -> !getBank().isOpen(), 4000);
		}
		if (getInventory().contains("Shrimps")) {
			int shrimpCount = getInventory().count("Shrimps");
			int copperCount = getInventory().count("Copper ore");
			int anchovyCount = getInventory().count("Anchovies");
			getGrandExchange().open();
			sleepUntil(() -> getGrandExchange().isOpen(), 4000);
			if (getInventory().contains("Copper ore")) {
				getGrandExchange().sellItem("Copper ore", copperCount, 1);
				sleep(1000, 2000);
			}
			if (getInventory().contains("Shrimps")) {
				getGrandExchange().sellItem("Shrimps", shrimpCount, 1);
				sleep(1000, 2000);
			}
			if (getInventory().contains("Anchovies")) {
				getGrandExchange().sellItem("Anchovies", anchovyCount, 1);
				sleep(1000, 2000);
			}
			sleep(2000, 4000);
			getGrandExchange().collect();
			sleep(1000, 2000);
			getGrandExchange().close();
			sleepUntil(() -> !getGrandExchange().isOpen(), 4000);
		}
	}

	private void Prep() {
		int x = Calculations.random(1, 50);
		WeildWeapons();
		while (!lummyBankArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(lummyBankArea.getRandomTile());
			sleep(1500, 3000);
		}
		if (lummyBankArea.contains(getLocalPlayer())) {
			GameObject bank = getGameObjects().closest("Bank booth");
			NPC banker = getNpcs().closest("Banker");
			while (!getBank().isOpen()) {
				if (x > 7) {
					if (bank != null) {
						bank.interact("Bank");
					}
				} else {
					if (banker != null) {
						banker.interact("Bank");
					}
				}
			}
			sleepUntil(() -> getBank().isOpen(), 4000);
			if (getBank().isOpen()) {
				getBank().depositAllItems();
				sleepUntil(() -> getInventory().isEmpty(), 4000);
				getBank().withdrawAll("Coins");
				sleepUntil(() -> getInventory().contains("Coins"), 4000);
				getBank().withdraw("Bucket");
				sleepUntil(() -> getInventory().contains("Bucket"), 4000);
				getBank().withdraw("Pot");
				sleepUntil(() -> getInventory().contains("Pot"), 4000);
				getBank().close();
				sleepUntil(() -> !getBank().isOpen(), 4000);
			}

		}
		FirstQuesting();
	}

	private void Combat() {
		log("In combat");
		CombatWalk();
		if (getLocalPlayer().isInCombat()) {
			while (getLocalPlayer().isInCombat() && Client.getClient().getInstance().getScriptManager().isRunning()) {
				sleepUntil(() -> !getLocalPlayer().isInCombat(), 4000);
			}
		}
		if (!getCombat().isAutoRetaliateOn()) {
			getCombat().toggleAutoRetaliate(true);
		}
		// TRAINING ATTACK
		while (getSkills().getRealLevel(Skill.ATTACK) <= 24
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			log("in attack");
			if (!chickenArea.contains(getLocalPlayer())) {
				CombatWalk();
			}
			if (getInventory().contains("Bronze sword") && !getEquipment().contains("Bronze sword")) {
				WeildWeapons();
			}
			if (getPlayerSettings().getConfig(43) != 0) { // 0 is att
				getTabs().open(Tab.COMBAT);
				getMouse().move(new Point(602, 275)); // Att button
				getMouse().click();
				log("Combat: Att");
			}
			AttackChicken();
			if (breakAttack == true) {
				if (getSkills().getRealLevel(Skill.ATTACK) >= 15) {
					breakAttack = false;
					break;
				}
			}
		}
		// TRAINING STRENGTH
		while (getSkills().getRealLevel(Skill.STRENGTH) <= 25
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			if (!chickenArea.contains(getLocalPlayer())) {
				CombatWalk();
			}
			if (getInventory().contains("Bronze sword") && !getEquipment().contains("Bronze sword")) {
				WeildWeapons();
			}
			if (getPlayerSettings().getConfig(43) != 1) { // 1 is str
				getTabs().open(Tab.COMBAT);
				getMouse().move(new Point(683, 272)); // Str button
				getMouse().click();
				log("Combat: Str");
			}
			AttackChicken();
			if (breakStrength == true) {
				if (getSkills().getRealLevel(Skill.STRENGTH) >= 15) {
					breakStrength = false;
					break;
				}
			}
		}
		// TRAINING DEFENCE
		while (getSkills().getRealLevel(Skill.DEFENCE) <= 24
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			if (!chickenArea.contains(getLocalPlayer())) {
				CombatWalk();
			}
			if (getInventory().contains("Bronze sword") && !getEquipment().contains("Bronze sword")) {
				WeildWeapons();
			}
			if (getPlayerSettings().getConfig(43) != 3) { // 3 is def
				getTabs().open(Tab.COMBAT);
				getMouse().move(new Point(683, 324)); // Def button
				getMouse().click();
				log("Combat: Str");
			}
			AttackChicken();
			if (breakDefence == true) {
				if (getSkills().getRealLevel(Skill.DEFENCE) >= 15) {
					breakDefence = false;
					break;
				}
			}
		}

	}

	private void CombatWalk() {
		while (!chickenArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(chickenArea.getRandomTile());
			sleepUntil(() -> chickenArea.contains(getLocalPlayer()), 2250);
		}
	}

	private void WeildWeapons() {
		getInventory().interact("Bronze sword", "Wield");
		sleepUntil(() -> !getInventory().contains("Bronze sword"), 3000);
		getInventory().interact("Wooden shield", "Wield");
		sleepUntil(() -> !getInventory().contains("Wooden shield"), 3000);
	}

	private void AttackChicken() {
		NPC chicken = getNpcs().closest(npc -> npc != null && !npc.isInCombat() && chickenArea.contains(npc));
		log(String.valueOf(chicken));

		chicken.interact("Attack");

		sleepUntil(() -> getLocalPlayer().isInCombat(), 1000);
		while (getLocalPlayer().isInCombat() && Client.getClient().getInstance().getScriptManager().isRunning()) {
			sleepUntil(() -> !getLocalPlayer().isInCombat(), 4000);
		}
		sleep(1000, 2000);
	}

	private void Woodcutting() {
		if (getInventory().contains("Bronze axe")) {
			getInventory().interact("Bronze axe", "Wield");
		}
		if (!getEquipment().contains("Bronze axe") || getInventory().isFull()) {
			BankWoodcutting();
		}
		if (!wcArea.contains(getLocalPlayer()) && getEquipment().contains("Bronze axe")) {
			while (!wcArea.contains(getLocalPlayer())
					&& Client.getClient().getInstance().getScriptManager().isRunning()) {
				getWalking().walk(wcArea.getRandomTile());
				sleepUntil(() -> wcArea.contains(getLocalPlayer()), 2500);
				log("Stuck");
			}
		}
		if (wcArea.contains(getLocalPlayer()) && getEquipment().contains("Bronze axe")) {
			GameObject tree = getGameObjects()
					.closest(g -> g != null && g.getName().equals("Tree") && wcArea.contains(g));
			if (tree != null) {
				tree.interact("Chop down");
			}
			sleepUntil(() -> getLocalPlayer().isAnimating(), 7000);
			sleepUntil(() -> !getLocalPlayer().isAnimating(), 15000);
			return;
		}
	}

	private void BankWoodcutting() {
		int x = Calculations.random(1, 50);
		while (!draynorBankArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(draynorBankArea.getRandomTile());
			sleepUntil(() -> draynorBankArea.contains(getLocalPlayer()), 2250);
		}
		GameObject bank = getGameObjects().closest("Bank booth");
		NPC banker = getNpcs().closest("Banker");
		while (!getBank().isOpen()) {
			if (x > 7) {
				if (bank != null) {
					bank.interact("Bank");
				}
			} else {
				if (banker != null) {
					banker.interact("Bank");
				}
			}
			sleepUntil(() -> getBank().isOpen(), 4000);
		}
		if (getBank().isOpen()) {
			getBank().depositAllItems();
			sleepUntil(() -> getInventory().isEmpty(), 3000);
			sleep(1000, 2000);
			if (!getEquipment().contains("Bronze axe") && !getInventory().contains("Bronze axe")) {
				getBank().depositAllEquipment();
				getBank().withdraw("Bronze axe");
				sleepUntil(() -> getInventory().contains("Bronze axe"), 5000);
			}
			getBank().close();
			sleepUntil(() -> !getBank().isOpen(), 5000);
		}
		if (getInventory().contains("Bronze axe")) {
			getInventory().interact("Bronze axe", "Wield");
		}
	}

	private void Firemaking() {
		while (logCheck != false && Client.getClient().getInstance().getScriptManager().isRunning()) {
			log("In fm");
			if (getInventory().count("Willow logs") != 27 || !getInventory().contains("Tinderbox")) {
				BankFiremaking();
			}
			if (edgeBankArea.contains(getLocalPlayer()) && !getInventory().contains("Willow logs")) {
				BankFiremaking();
			}
			if (getInventory().contains("Willow logs")) {
				while (!fmArea.contains(getLocalPlayer())
						&& Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(fmArea.getRandomTile());
					sleepUntil(() -> fmArea.contains(getLocalPlayer()), 2500);
				}
				if (fmArea.contains(getLocalPlayer()) && getInventory().contains("Willow logs")) {
					sleep(2000, 4000);
					while (fmTile.distance() != 0 && Client.getClient().getInstance().getScriptManager().isRunning()) {
						if (fmSpot == 1) {
							getWalking().walkOnScreen(fmTile);
							fmSpot = 0;
						}
						if (fmSpot == 0) {
							getWalking().walkOnScreen(fmTile2);
							fmSpot = 1;
						}
						sleepUntil(() -> fmTile.distance() == 0, 4000);
					}
				}
				if (fmTile.distance() == 0 || fmTile2.distance() == 0) {
					int failSafe = 0;
					while ((getInventory().contains("Willow logs") || failSafe == 30)
							&& Client.getClient().getInstance().getScriptManager().isRunning()) {
						Item tBox = getInventory().get("Tinderbox");
						if (tBox != null) {
							Tile currentTile = getLocalPlayer().getTile();
							tBox.useOn("Willow logs");
							sleepUntil(() -> getLocalPlayer().isAnimating(), 4000);

							Tile failTile = new Tile(currentTile.getX() + 1, currentTile.getY(), 0);
							sleepUntil(() -> currentTile.distance() == 1, 15000);
							sleep(150, 250);
							if (currentTile.distance() == 0) {
								Tile nextTile = new Tile(currentTile.getX() - 1, currentTile.getY(), 0);
								getWalking().walkOnScreen(nextTile);
							}
							if (failTile.distance() == 0) {
								BankFiremaking();
							}

						}
						failSafe++;
					}
				}
			}
		}
	}

	private void BankFiremaking() {
		int x = Calculations.random(1, 50);
		if (!edgeBankArea.contains(getLocalPlayer())) {
			log("Walking there");
			while (!edgeBankArea.contains(getLocalPlayer())
					&& Client.getClient().getInstance().getScriptManager().isRunning()) {
				getWalking().walk(edgeBankArea.getRandomTile());
				sleepUntil(() -> edgeBankArea.contains(getLocalPlayer()), 4000);
			}
		}
		if (edgeBankArea.contains(getLocalPlayer())) {
			GameObject bank = getGameObjects().closest("Bank booth");
			NPC banker = getNpcs().closest("Banker");
			while (!getBank().isOpen()) {
				if (x > 7) {
					if (bank != null) {
						bank.interact("Bank");
					}
				} else {
					if (banker != null) {
						banker.interact("Bank");
					}
				}
				sleepUntil(() -> getBank().isOpen(), 4000);
			}
			if (getBank().isOpen()) {
				if (getBank().count("Willow logs") < 28) {
					logCheck = false;
				}
				if (!getInventory().contains("Tinderbox")) {
					getBank().withdraw("Tinderbox");
					sleepUntil(() -> getInventory().contains("Tinderbox"), 4000);
				}
				getBank().depositAllExcept("Tinderbox");
				sleepUntil(() -> getInventory().onlyContains("Tinderbox"), 3000);
				getBank().withdrawAll("Willow logs");
				sleepUntil(() -> getInventory().contains("Willow logs"), 4000);
				sleep(1000, 2000);
				getBank().close();
				sleepUntil(() -> !getBank().isOpen(), 5000);
			}

		}
	}

	private void Fishing() {
		log("In fishing");
		while (getSkills().getRealLevel(Skill.FISHING) < 30
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			int randomNum = Calculations.random(1, 100);
			if (getInventory().isFull() || !getInventory().contains("Small fishing net")) {
				BankFishing();
			}
			if (!desertBankArea.contains(getLocalPlayer()) && !fishArea.contains(getLocalPlayer())) {
				log("This loop");
				BankFishing();
			}
			while (!fishArea.contains(getLocalPlayer())
					&& Client.getClient().getInstance().getScriptManager().isRunning()) {
				getWalking().walk(fishArea.getRandomTile());
				sleep(3000, 5000);
			}

			NPC fishy = getNpcs().closest(fishSpot -> fishSpot != null && fishSpot.hasAction("Small Net"));
			fishy.interact("Small Net");
			sleepUntil(() -> getLocalPlayer().isAnimating(), 3000);
			if (randomNum > 50) {
				getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
			}
			sleepUntil(() -> !getLocalPlayer().isAnimating(), 180000);
			if (randomNum > 50) {
				getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
			}

		}
	}

	private void Mining() {
		log("In mining");
		while (getSkills().getRealLevel(Skill.MINING) < 30
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			if (getInventory().isFull()) {
				BankMining();
			}
			if (getInventory().contains("Bronze pickaxe")) {
				getInventory().interact("Bronze pickaxe", "Wield");
				sleep(1000, 2000);
			}
			if (!getEquipment().contains("Bronze pickaxe") && !getInventory().contains("Bronze pickaxe")) {
				BankMining();
			}
			int randomNum = Calculations.random(1, 100);
			if (miningTile.distance() == 1) {
				while (miningTile.distance() != 0 && Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walkOnScreen(miningTile);
					sleepUntil(() -> miningTile.distance() == 0, 5000);
				}
			}
			if (miningTile.distance() != 0) {
				while (miningTile.distance() != 0 && Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(miningTile);
					sleepUntil(() -> miningTile.distance() == 0, 2500);
				}
			}

			GameObject rock = getGameObjects().closest(gameObject -> gameObject != null && gameObject.getID() == 7484);
			rock.interact("Mine");
			sleepUntil(() -> getLocalPlayer().isAnimating(), 3000);
			if (randomNum > 90) {
				getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
			}
			sleepUntil(() -> !getLocalPlayer().isAnimating(), 15000);
			if (randomNum > 80) {
				getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
			}
		}

	}

	private void Cooking() {
		log("In cooking");
		while (noShrimps == false && noAnchovies == false
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			if (cookArea.contains(getLocalPlayer())
					&& (getInventory().contains("Raw shrimps") || getInventory().contains("Raw anchovies"))) {
				GameObject range = getGameObjects().closest("Range");
				if (range != null) {
					range.interact();
					sleepUntil(() -> getDialogues().inDialogue(), 3000);
				}
				Item cookItem = getInventory().get(item -> item != null && item.getName().contains("Raw"));
				if (getInventory().contains(cookItem)) {
					WidgetChild shrimp = getWidgets().getWidget(270).getChild(14);
					if (shrimp != null) {
						shrimp.interact();
						sleep(3000, 4000);
						sleepUntil(() -> !getInventory().contains(cookItem) || getDialogues().inDialogue(), 200000);
						if (getDialogues().canContinue()) {
							if (getDialogues().continueDialogue()) {
								sleepUntil(() -> !getDialogues().canContinue(), 3000);
							}
						}
					}
				} else {
					stop();
				}
			}
			int x = Calculations.random(1, 50);
			if (!getInventory().contains("Raw shrimps") || !getInventory().contains("Raw anchovies")) {
				while (!desertBankArea.contains(getLocalPlayer()) && !getInventory().contains("Raw shrimps")
						&& Client.getClient().getInstance().getScriptManager().isRunning()) {
					getWalking().walk(desertBankArea.getRandomTile());
					sleep(3000, 5000);
				}

			}
			if (desertBankArea.contains(getLocalPlayer())) {
				BankCooking();
			}

		}
	}

	public void BankFishing() {
		int x = Calculations.random(1, 50);
		while (!desertBankArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(desertBankArea.getRandomTile());
			sleep(3000, 5000);
		}
		if (desertBankArea.contains(getLocalPlayer())) {
			GameObject bank = getGameObjects().closest("Bank booth");
			NPC banker = getNpcs().closest("Banker");
			while (!getBank().isOpen()) {
				if (x > 7) {
					if (bank != null) {
						bank.interact("Bank");
					}
				} else {
					if (banker != null) {
						banker.interact("Bank");
					}
				}
				sleepUntil(() -> getBank().isOpen(), 4000);
				if (getBank().isOpen()) {
					if (!getInventory().contains("Small fishing net")) {
						getBank().withdraw("Small fishing net");
						sleepUntil(() -> getInventory().contains("Small fishing net"), 5000);
					}
					getBank().depositAllExcept("Small fishing net");
					if (x > 15) {
						sleepUntil(() -> !getInventory().contains("Raw shrimps"), 10000);
					} else {
						sleep(5000, 10000);
					}
				}
			}
		}
		if (x < 7) {
			getBank().close();
			sleep(2000, 4000);
		}
		if (x > 25) {
			getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
		}
		while (!fishArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(fishArea.getRandomTile());
			sleep(3000, 5000);
		}
	}

	public void BankMining() {
		int x = Calculations.random(1, 50);
		while (!miningBankArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(miningBankArea.getRandomTile());
			sleep(3000, 5000);
		}
		if (miningBankArea.contains(getLocalPlayer())) {
			GameObject bank = getGameObjects().closest("Bank booth");
			NPC banker = getNpcs().closest("Banker");
			while (!getBank().isOpen()) {
				if (x > 7) {
					if (bank != null) {
						bank.interact("Bank");
					}
				} else {
					if (banker != null) {
						banker.interact("Bank");
					}
				}
				sleepUntil(() -> getBank().isOpen(), 4000);
				if (getBank().isOpen()) {
					getBank().depositAllItems();
					sleepUntil(() -> getInventory().isEmpty(), 5000);
					if (!getInventory().contains("Bronze pickaxe") && !getEquipment().contains("Bronze pickaxe")) {
						getBank().withdraw("Bronze pickaxe");
						sleepUntil(() -> getInventory().contains("Bronze pickaxe"), 5000);
					}
				}
			}
		}
		getBank().close();
		sleepUntil(() -> !getBank().isOpen(), 5000);
		while (miningTile.distance() != 0 && Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(miningTile);
			sleep(3000, 5000);
			if (x > 40) {
				getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
			}
		}
	}

	public void BankCooking() {
		int x = Calculations.random(1, 50);
		while (!desertBankArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(desertBankArea.getRandomTile());
			sleep(3000, 5000);
		}
		GameObject bank = getGameObjects().closest("Bank booth");
		NPC banker = getNpcs().closest("Banker");
		while (!getBank().isOpen()) {
			if (x > 7) {
				if (bank != null) {
					bank.interact("Bank");
				}
			} else {
				if (banker != null) {
					banker.interact("Bank");
				}
			}
			sleepUntil(() -> getBank().isOpen(), 4000);
		}
		if (getBank().isOpen()) {
			getBank().depositAllItems();
			sleep(1500, 3000);
			if (!getInventory().contains("Raw shrimps") && !getInventory().contains("Raw anchovies")) {
				if (getBank().count("Raw shrimps") > 30 && !getInventory().isFull()) {
					getBank().withdraw("Raw shrimps", 28);
					sleepUntil(() -> getInventory().isFull(), 3000);
				}
				if (getBank().count("Raw anchovies") > 30 && !getInventory().isFull()) {
					getBank().withdraw("Raw anchovies", 28);
					sleepUntil(() -> getInventory().isFull(), 3000);
				}
				if (getBank().count("Raw shrimps") <= 29 && getBank().count("Raw anchovies") <= 29) {
					noShrimps = true;
					noAnchovies = true;
					stop();
					return;
				}
			}
			if (x > 15) {
				sleep(1500, 2500);
			} else {
				sleep(5000, 10000);
			}
		}

		if (x < 7) {
			getBank().close();
			sleep(2000, 4000);
		}
		if (x > 25) {
			getCamera().rotateTo(Calculations.random(5797, 7613), Calculations.random(4976, 6730));
		}
		while (!cookArea.contains(getLocalPlayer())
				&& Client.getClient().getInstance().getScriptManager().isRunning()) {
			getWalking().walk(cookArea.getRandomTile());
			sleep(3000, 5000);
		}
	}

}
