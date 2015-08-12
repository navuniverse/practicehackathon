/*
 * 3CLogic Inc. CONFIDENTIAL
 * Unpublished Copyright (c) 2007-2014 3CLogic Inc., All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property of COMPANY. The intellectual and technical concepts contained
 * herein are proprietary to COMPANY and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained
 * from COMPANY.  Access to the source code contained herein is hereby forbidden to anyone except current COMPANY employees, managers or contractors who have executed 
 * Confidentiality and Non-disclosure agreements explicitly covering such access.
 *
 * The copyright notice above does not evidence any actual or intended publication or disclosure  of  this source code, which includes  
 * information that is confidential and/or proprietary, and is a trade secret, of  COMPANY.   ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, 
 * OR PUBLIC DISPLAY OF OR THROUGH USE  OF THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE 
 * LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  
 * TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.                
 */
package com.gs.smi;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Naveen
 * 
 * @Date 12-Aug-2015
 */
public class Addition {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int param1, param2, sum;
		char choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Welcome to addition API.");
		System.out.println(" PS: Negative nnumbers are allowed");

		do {
			sum = 0;
			System.out.println(" Enter paramater 1: ");
			param1 = scanner.nextInt();
			System.out.println(" Enter paramater 2: ");
			param2 = scanner.nextInt();

			sum = param1 + param2;
			System.out.println(" The sum of " + param1 + " and " + param2 + " is: " + sum);
			System.out.println(" Do you want to add more? (Y|N): ");
			choice = (char) System.in.read();
		} while (choice == 'y' || choice == 'Y');
		System.out.println(" Thanks for using the API.");
		System.out.println("(C) Naveen Kumar. 2015.");
		scanner.close();
	}

}
