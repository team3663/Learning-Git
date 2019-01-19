/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.input;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * Add your docs here.
 */
public final class XBoxGamePad extends Joystick {
    private final Button[] buttons = {
        new JoystickButton(this, 1),
        new JoystickButton(this, 2),
        new JoystickButton(this, 3),
        new JoystickButton(this, 4),
        new JoystickButton(this, 5),
        new JoystickButton(this, 6),
        new JoystickButton(this, 7),
        new JoystickButton(this, 8),
        new JoystickButton(this, 9),
        new JoystickButton(this, 10),
    };

    public XBoxGamePad(int port){
        super(port);
        
    }

    public Button getAButton(){
        return buttons[0];
    }

    public Button getBButton(){
        return buttons[1];
    }

    public Button getXButton(){
        return buttons[2];
    }

    public Button getYButton(){
        return buttons[3];
    }

    public Button getLeftBumper(){
        return buttons[4];
    }

    public Button getRightBumper(){
        return buttons[5];
    }

    public Button getBackButton(){
        return buttons[6];
    }

    public Button getStartButton(){
        return buttons[7];
    }

    public Button getLeftStickButton(){
        return buttons[8];
    }

    public Button getRightStickButton(){
        return buttons[9];
    }

    public double getLeftXAxis(){
        return getRawAxis(0);
    }

    public double getLeftYAxis(){
        return -getRawAxis(1);
    }

    public double getRightYAxis(){
        return -getRawAxis(5);
    }

    public double getRightXAxis(){
        return getRawAxis(4);
    }

    public double getLeftTrigger(){
        return getRawAxis(2);
    }

    public double getRightTrigger(){
        return getRawAxis(3);
    }

    public int getDpadAngle(){
        return getPOV();
    }

}
