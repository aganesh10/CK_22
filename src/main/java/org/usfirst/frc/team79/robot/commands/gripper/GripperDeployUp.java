// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package org.usfirst.frc.team79.robot.commands.gripper;

// import org.usfirst.frc.team79.robot.Robot;

// import edu.wpi.first.wpilibj.command.Command;

// //Can move hugger back up to default and resting position
// public class GripperDeployUp extends Command {
//   public GripperDeployUp() {
//     // Use requires() here to declare subsystem dependencies
//     // eg. requires(chassis);
//   }

//   // Called just before this Command runs the first time
//   @Override
//   protected void initialize() {
//   }

//   // Called repeatedly when this Command is scheduled to run
//   @Override
//   protected void execute() {
//     Robot.gripper.solenoidRetract(Robot.gripper.deploy);
//   }

//   // Make this return true when this Command no longer needs to run execute()
//   @Override
//   protected boolean isFinished() {
//     return true;
//   }

//   // Called once after isFinished returns true
//   @Override
//   protected void end() {
//   }
// }
