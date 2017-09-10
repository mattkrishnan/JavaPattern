/*@author Tushar Balarajan
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   Assignment 1.3
   This is a simple assignment to understand println and calling a method to make a pattern


***** BEGIN LICENSE BLOCK *****
        Version: MPL 1.1/GPL 2.0/LGPL 2.1

        The contents of this file are subject to the Mozilla Public License Version
        1.1 (the "License"); you may not use this file except in compliance with
        the License. You may obtain a copy of the License at
        http://www.mozilla.org/MPL/

        Software distributed under the License is distributed on an "AS IS" basis,
        WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
        for the specific language governing rights and limitations under the
        License.

        The Initial Developer of the Original Code is
        Tushar Balarajan.
        Portions created by the Initial Developer are Copyright (C) 2017
        the Initial Developer. All Rights Reserved.

        Contributor(s):

        Alternatively, the contents of this file may be used under the terms of
        either the GNU General Public License Version 2 or later (the "GPL"), or
        the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
        in which case the provisions of the GPL or the LGPL are applicable instead
        of those above. If you wish to allow use of your version of this file only
        under the terms of either the GPL or the LGPL, and not to allow others to
        use your version of this file under the terms of the MPL, indicate your
        decision by deleting the provisions above and replace them with the notice
        and other provisions required by the GPL or the LGPL. If you do not delete
        the provisions above, a recipient may use your version of this file under
        the terms of any one of the MPL, the GPL or the LGPL.

        ***** END LICENSE BLOCK *****
*/
import java.util.Scanner;

public class Main {
    /**<h3><b>JAVA DOC</b></h3>
     * <p>This is a simple program that displaysa pattern.</p>
     * <ul>
     * <li></li>Asks for user input and returns pattern if choice is 1</li>
     * <li>If choice is 0, prints an acknowlegment</li>
     * <li>If choice is anything but 1 or 0, prints error</li>
     * </ul>
     *
     */

    /**
     *
     * @param choice <p>just takes in an int and prints out a pattern. </p>
     * @return <p>a pattern made from concatenating strings.</p>
     */
    public static String showPattern (int choice){

        if (choice == 1) {
            String firstLine = "    J    A     V     V    A\n";
            String secondLine = "    J   A A     V   V    A A\n";
            String thirdLine = "J   J  AAAAA     V V    AAAAA\n";
            String fourthline = " JJ   A     A     V    A     A\n";
            String complete = firstLine + secondLine + thirdLine + fourthline;
            return (complete);

        }
        else return (" ");
    }

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        System.out.print("Want to see a cool pattern? 1 for yes or 0 for no: ");
        int choice = kybd.nextInt();

        if (choice ==1){
            System.out.print(showPattern(1));
        }
        else if (choice ==0) {
            System.out.println("No pattern for you then.");
        }
        else System.out.println("Not a valid option!");


    }}

