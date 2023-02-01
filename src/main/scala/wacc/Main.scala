package wacc

import parsley.{Success, Failure}
// import wacc.io.readFile
import wacc.parser.parse
import wacc.io.readFile

object Main {
    def main(args: Array[String]): Unit = {
        parse(readFile(args.head)) match {
            case Success(x) => {
                // This is for us during debugging
                System.err.println("exit:\n100")
                sys.exit(0)
            }
            case Failure(msg) => {
                System.err.println("#syntax error#")
                // This is for us during debugging
                System.err.println("exit:\n100")
                sys.exit(100)                   
            }
        }
    }
}
 