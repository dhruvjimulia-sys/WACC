package wacc

class BackendTests extends IntegrationTest {
  runTestOnDirectory("valid/basic", true, runBackendTest)
  runTestOnDirectory("valid/array", true, runBackendTest)
  runTestOnDirectory("valid/function", true, runBackendTest)
  runTestOnDirectory("valid/pairs", true, runBackendTest)
  runTestOnDirectory("valid/runtimeErr", false, runBackendTest)
  runTestOnDirectory("valid/if", true, runBackendTest)
  runTestOnDirectory("valid/variables", true, runBackendTest)
  runTestOnDirectory("valid/sequence", true, runBackendTest)
  runTestOnDirectory("valid/expressions", true, runBackendTest)
  runTestOnDirectory("valid/while", true, runBackendTest)
  runTestOnDirectory("valid/IO", false, runBackendTest)
  runTestOnDirectory("valid/scope", true, runBackendTest)
}
