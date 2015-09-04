//
//  ViewController.swift
//  Project 5
//
//  Created by Ipsit Patra on 5/1/15.
//  Copyright (c) 2015 Ipsit Patra. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    //display area
    @IBOutlet var displayArea: UILabel!
    //holds number from previous entry to perform add and sub
    var lastNumber: Int = 0
//    var lastNumber: String = ""
    
   // hold the operation to be performed
    @IBOutlet var operatorLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
   
    //clear function
    @IBAction func clearTapped(digit: UIButton) {
        displayArea.text = "0"
        lastNumber = 0
        operatorLabel.text = ""
    }
    
    //take input from 0 1 2 buttons
    @IBAction func digitTapped(digit: UIButton) {
        
        println(digit.titleLabel?.text)
        if displayArea.text == "0"
        {
           // displayArea.text = ""
            displayArea.text = digit.titleLabel?.text
        }
//        else if operatorLabel.text == ""{
//            displayArea.text = digit.titleLabel?.text
//        }
        else
        {
            if let txt = digit.titleLabel?.text
            {
//                append only when the number is not 0
                
                if count(displayArea.text!) < 10
                {
                    println("count under 10 \(count(displayArea.text!))")
                    displayArea.text = displayArea.text! + txt
                }
            }
        }
        
    }
    
    //invoked the add function
    @IBAction func addTapped(digit: UIButton) {
        
        println("Add invoked")
//        displayArea.text = "0"
        if operatorLabel.text == ""
        {
            operatorLabel.text = "+"
            lastNumber = displayArea.text!.toInt()!
            println("last number = \(lastNumber)")
            displayArea.text = "0"
            
        }
        else
        {
            println("Invoking Result")
            //invoked after both operand are given
            resultTapped(nil)
            operatorLabel.text = "+"
//            displayArea.text = String(lastNumber)
        }
        
    }
    
    //invoked the subtract function
    @IBAction func subtractTapped(digit: UIButton) {
        
        println("Subtract invoked")
//        displayArea.text = "0"
        if operatorLabel.text == ""
        {
            operatorLabel.text = "-"
            lastNumber = displayArea.text!.toInt()!
            println("last number = \(lastNumber)")
            displayArea.text = "0"
        }
        else
        {
            println("Invoking Result")
            //invoked after both operand are given
            resultTapped(nil)
            operatorLabel.text = "-"
//            displayArea.text = String(lastNumber)
        }
        
//        displayArea.text = "0"
    }
   
    //change sign function
    @IBAction func signTapped(digit: UIButton) {
        
        println("Sign Change invoked")
        //multiply the existing value to -1 to change sign
        lastNumber = displayArea.text!.toInt()! * -1
        displayArea.text = String(lastNumber)
//        base3tobase10(lastNumber)
    }
    
    
    //invoked by the = function to display the result
    @IBAction func resultTapped(AnyObject?) {
//        var n1 = lastNumber.toInt()
        println("result tapped invoked")
        var n2 = displayArea.text!.toInt()
        //execute if operation in -
        if operatorLabel.text == "-"
        {
            println("=> \(lastNumber)")
            lastNumber = base10tobase3(base3tobase10(lastNumber) - base3tobase10(n2!))
        operatorLabel.text = ""
        }//if operation is +
        else if operatorLabel.text == "+"
        {
            var n2 = displayArea.text!.toInt()
            if operatorLabel.text == "+"
            {
                println("=> \(lastNumber) =>> \(base3tobase10(lastNumber) + base3tobase10(n2!))")
                lastNumber = base10tobase3(base3tobase10(lastNumber) + base3tobase10(n2!))
                operatorLabel.text = ""
            }
        }
//        println("LastNumber : \(last)")
        //display the number after performing operation
        displayArea.text = String(lastNumber)
        //clear performed operation
        operatorLabel.text = ""
    }
    
    //change base from 3 to 10 
    func base3tobase10(b3: Int)->(Int){
     println("base3tobase10 into -> \(b3)")
        //flag to Check negative value
        var isNegFlag: Bool = false
        var num: Int = 0
        var count: Int = 0
        var returnVal: Int = 0
        
        if b3 < 0
        {
            num = 0 - b3
            println("Dealing with negative \(num)")
            isNegFlag = true
        }
        else
        {
            num = b3
            println("Dealing with positive \(num)")
            isNegFlag = false
            
        }
        
        while num > 0
        {
            var remainder = num % 10
            //expanding with base 3
            returnVal += remainder * ((Int(pow(Double(3), Double(count)))))
            count += 1
            num /= 10
        }
        //return the back to negative after conversion
        if isNegFlag
        {
            returnVal = 0 - returnVal
        }
        println("base3tobase10=> \(returnVal)")
        return returnVal
        
        //        return 0
    }
    
    //change base from 10 to 3
    func base10tobase3(b10: Int)->(Int){
        println("10 to 3 into -> \(b10)")
        
        //flag to Check negative value
        var isNegFlag: Bool = false
        var num: Int = 0
        var count: Int = 0
        var returnVal: Int = 0
        
        if b10 < 0
        {
            num = 0 - b10
            println("Dealing with negative \(num)")
            isNegFlag = true
            
        }
        else
        {
            isNegFlag = false
            num = b10
            println("Dealing with negative \(num)")
            
            
        }
        
        while num > 0
        {
            var remainder = num % 3
            num /= 3
            returnVal += remainder * ((Int(pow(Double(10), Double(count)))))
            count += 1
        }
        //return the back to negative after conversion
        if isNegFlag {
            returnVal = 0 - returnVal
        }
        println("base10tobase3=> \(returnVal)")
        return returnVal
    }
    
    
}