/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.input.XBoxGamePad;

/**
 * Add your docs here.
 */
public class OI {
    private XBoxGamePad primaryController = new XBoxGamePad(0);

    public OI(){
    }

    // public void registerControls(){
    //     primaryController.getLeftYAxis();
    //     primaryController.getRightYAxis();
    // }
        
    public XBoxGamePad getPrimaryController(){
        return primaryController;
    }
}