/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/java8/box")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BlackBoxWithJava8CodegenTestGenerated extends AbstractBlackBoxCodegenTest {
    public void testAllFilesPresentInBox() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("async.kt")
    public void testAsync() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/async.kt");
        doTest(fileName);
    }

    @TestMetadata("asyncException.kt")
    public void testAsyncException() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/asyncException.kt");
        doTest(fileName);
    }

    @TestMetadata("capturedSuperCall.kt")
    public void testCapturedSuperCall() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/capturedSuperCall.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultMethodCallFromInterface.kt")
    public void testDefaultMethodCallFromInterface() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/defaultMethodCallFromInterface.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultMethodCallViaClass.kt")
    public void testDefaultMethodCallViaClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/defaultMethodCallViaClass.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultMethodCallViaInterface.kt")
    public void testDefaultMethodCallViaInterface() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/defaultMethodCallViaInterface.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultMethodOverride.kt")
    public void testDefaultMethodOverride() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/defaultMethodOverride.kt");
        doTest(fileName);
    }

    @TestMetadata("dontDelegateToDefaultMethods.kt")
    public void testDontDelegateToDefaultMethods() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/dontDelegateToDefaultMethods.kt");
        doTest(fileName);
    }

    @TestMetadata("functionAssertion.kt")
    public void testFunctionAssertion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/functionAssertion.kt");
        doTest(fileName);
    }

    @TestMetadata("inheritKotlin.kt")
    public void testInheritKotlin() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/inheritKotlin.kt");
        doTest(fileName);
    }

    @TestMetadata("invokeDefaultViaSuper.kt")
    public void testInvokeDefaultViaSuper() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/invokeDefaultViaSuper.kt");
        doTest(fileName);
    }

    @TestMetadata("invokeDefaultViaSuper_16.kt")
    public void testInvokeDefaultViaSuper_16() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/invokeDefaultViaSuper_16.kt");
        doTest(fileName);
    }

    @TestMetadata("longChainOfKotlinExtendsFromJavaWithDefault.kt")
    public void testLongChainOfKotlinExtendsFromJavaWithDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/longChainOfKotlinExtendsFromJavaWithDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("removeIf.kt")
    public void testRemoveIf() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/removeIf.kt");
        doTest(fileName);
    }

    @TestMetadata("samOnInterfaceWithDefaultMethod.kt")
    public void testSamOnInterfaceWithDefaultMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/samOnInterfaceWithDefaultMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("stream.kt")
    public void testStream() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/stream.kt");
        doTest(fileName);
    }

    @TestMetadata("streamBackwardCompatibility.kt")
    public void testStreamBackwardCompatibility() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/streamBackwardCompatibility.kt");
        doTest(fileName);
    }

    @TestMetadata("useStream.kt")
    public void testUseStream() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/useStream.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/java8/box/builtinStubMethods")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class BuiltinStubMethods extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInBuiltinStubMethods() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/builtinStubMethods"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("immutableRemove.kt")
        public void testImmutableRemove() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/builtinStubMethods/immutableRemove.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/delegationBy")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DelegationBy extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInDelegationBy() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/delegationBy"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("byMiddleInterface.kt")
        public void testByMiddleInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/byMiddleInterface.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultOverride.kt")
        public void testDefaultOverride() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/defaultOverride.kt");
            doTest(fileName);
        }

        @TestMetadata("delegationToMap.kt")
        public void testDelegationToMap() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/delegationToMap.kt");
            doTest(fileName);
        }

        @TestMetadata("diamond.kt")
        public void testDiamond() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/diamond.kt");
            doTest(fileName);
        }

        @TestMetadata("diamond2.kt")
        public void testDiamond2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/diamond2.kt");
            doTest(fileName);
        }

        @TestMetadata("inClassDeclaration.kt")
        public void testInClassDeclaration() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/inClassDeclaration.kt");
            doTest(fileName);
        }

        @TestMetadata("mixed.kt")
        public void testMixed() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/mixed.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("simple1.0.kt")
        public void testSimple1_0() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/delegationBy/simple1.0.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/jvm8")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jvm8 extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInJvm8() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("bridgeInClass.kt")
        public void testBridgeInClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/bridgeInClass.kt");
            doTest(fileName);
        }

        @TestMetadata("bridgeInInterface.kt")
        public void testBridgeInInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/bridgeInInterface.kt");
            doTest(fileName);
        }

        @TestMetadata("capturedSuperCall.kt")
        public void testCapturedSuperCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/capturedSuperCall.kt");
            doTest(fileName);
        }

        @TestMetadata("defaultArgs.kt")
        public void testDefaultArgs() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaultArgs.kt");
            doTest(fileName);
        }

        @TestMetadata("inlineFromAnotherFile.kt")
        public void testInlineFromAnotherFile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/inlineFromAnotherFile.kt");
            doTest(fileName);
        }

        @TestMetadata("inlineFromStdlib.kt")
        public void testInlineFromStdlib() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/inlineFromStdlib.kt");
            doTest(fileName);
        }

        @TestMetadata("kt11969.kt")
        public void testKt11969() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt11969.kt");
            doTest(fileName);
        }

        @TestMetadata("kt14243.kt")
        public void testKt14243() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt14243.kt");
            doTest(fileName);
        }

        @TestMetadata("kt14243_2.kt")
        public void testKt14243_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt14243_2.kt");
            doTest(fileName);
        }

        @TestMetadata("kt14243_prop.kt")
        public void testKt14243_prop() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt14243_prop.kt");
            doTest(fileName);
        }

        @TestMetadata("kt16581.kt")
        public void testKt16581() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt16581.kt");
            doTest(fileName);
        }

        @TestMetadata("kt16581_2.kt")
        public void testKt16581_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt16581_2.kt");
            doTest(fileName);
        }

        @TestMetadata("kt16588.kt")
        public void testKt16588() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt16588.kt");
            doTest(fileName);
        }

        @TestMetadata("kt6301.kt")
        public void testKt6301() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt6301.kt");
            doTest(fileName);
        }

        @TestMetadata("kt6301_2.kt")
        public void testKt6301_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/kt6301_2.kt");
            doTest(fileName);
        }

        @TestMetadata("oneImplementation.kt")
        public void testOneImplementation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/oneImplementation.kt");
            doTest(fileName);
        }

        @TestMetadata("oneImplementation2.kt")
        public void testOneImplementation2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/oneImplementation2.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleCall.kt")
        public void testSimpleCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/simpleCall.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleProperty.kt")
        public void testSimpleProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/simpleProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Defaults extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInDefaults() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("bridgeInClass.kt")
            public void testBridgeInClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInClass.kt");
                doTest(fileName);
            }

            @TestMetadata("bridgeInInterface.kt")
            public void testBridgeInInterface() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/bridgeInInterface.kt");
                doTest(fileName);
            }

            @TestMetadata("capturedSuperCall.kt")
            public void testCapturedSuperCall() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/capturedSuperCall.kt");
                doTest(fileName);
            }

            @TestMetadata("defaultArgs.kt")
            public void testDefaultArgs() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/defaultArgs.kt");
                doTest(fileName);
            }

            @TestMetadata("diamond.kt")
            public void testDiamond() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/diamond.kt");
                doTest(fileName);
            }

            @TestMetadata("kt11969.kt")
            public void testKt11969() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/kt11969.kt");
                doTest(fileName);
            }

            @TestMetadata("kt14243.kt")
            public void testKt14243() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243.kt");
                doTest(fileName);
            }

            @TestMetadata("kt14243_2.kt")
            public void testKt14243_2() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243_2.kt");
                doTest(fileName);
            }

            @TestMetadata("kt14243_prop.kt")
            public void testKt14243_prop() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/kt14243_prop.kt");
                doTest(fileName);
            }

            @TestMetadata("oneImplementation.kt")
            public void testOneImplementation() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/oneImplementation.kt");
                doTest(fileName);
            }

            @TestMetadata("oneImplementation2.kt")
            public void testOneImplementation2() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/oneImplementation2.kt");
                doTest(fileName);
            }

            @TestMetadata("simpleCall.kt")
            public void testSimpleCall() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/simpleCall.kt");
                doTest(fileName);
            }

            @TestMetadata("simpleProperty.kt")
            public void testSimpleProperty() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/simpleProperty.kt");
                doTest(fileName);
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/superCall.kt");
                doTest(fileName);
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class NoDelegation extends AbstractBlackBoxCodegenTest {
                public void testAllFilesPresentInNoDelegation() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("noDelegationToDefaultMethodInClass.kt")
                public void testNoDelegationToDefaultMethodInClass() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInClass.kt");
                    doTest(fileName);
                }

                @TestMetadata("noDelegationToDefaultMethodInInterface.kt")
                public void testNoDelegationToDefaultMethodInInterface() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInInterface.kt");
                    doTest(fileName);
                }

                @TestMetadata("noDelegationToDefaultMethodInInterface2.kt")
                public void testNoDelegationToDefaultMethodInInterface2() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/noDelegation/noDelegationToDefaultMethodInInterface2.kt");
                    doTest(fileName);
                }
            }

            @TestMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/reflection")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class Reflection extends AbstractBlackBoxCodegenTest {
                public void testAllFilesPresentInReflection() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/defaults/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
                }

                @TestMetadata("propertyAnnotations.kt")
                public void testPropertyAnnotations() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/reflection/propertyAnnotations.kt");
                    doTest(fileName);
                }

                @TestMetadata("propertyAnnotationsCompatibility.kt")
                public void testPropertyAnnotationsCompatibility() throws Exception {
                    String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/defaults/reflection/propertyAnnotationsCompatibility.kt");
                    doTest(fileName);
                }
            }
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/interfaceFlag")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class InterfaceFlag extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInInterfaceFlag() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/interfaceFlag"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("superCall.kt")
            public void testSuperCall() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/interfaceFlag/superCall.kt");
                doTest(fileName);
            }

            @TestMetadata("superCallIndirect.kt")
            public void testSuperCallIndirect() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/interfaceFlag/superCallIndirect.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/codegen/java8/box/jvm8/optimizations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Optimizations extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInOptimizations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/jvm8/optimizations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("hashCode.kt")
            public void testHashCode() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/jvm8/optimizations/hashCode.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/mapGetOrDefault")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MapGetOrDefault extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInMapGetOrDefault() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/mapGetOrDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noTypeSafeBridge.kt")
        public void testNoTypeSafeBridge() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapGetOrDefault/noTypeSafeBridge.kt");
            doTest(fileName);
        }

        @TestMetadata("typeSafeBridge.kt")
        public void testTypeSafeBridge() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapGetOrDefault/typeSafeBridge.kt");
            doTest(fileName);
        }

        @TestMetadata("typeSafeBridgeNotNullAny.kt")
        public void testTypeSafeBridgeNotNullAny() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapGetOrDefault/typeSafeBridgeNotNullAny.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/mapRemove")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MapRemove extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInMapRemove() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/mapRemove"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("noDefaultImpls.kt")
        public void testNoDefaultImpls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapRemove/noDefaultImpls.kt");
            doTest(fileName);
        }

        @TestMetadata("readOnlyMap.kt")
        public void testReadOnlyMap() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapRemove/readOnlyMap.kt");
            doTest(fileName);
        }

        @TestMetadata("typeSafeBridge.kt")
        public void testTypeSafeBridge() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapRemove/typeSafeBridge.kt");
            doTest(fileName);
        }

        @TestMetadata("typeSafeBridgeNotNullAny.kt")
        public void testTypeSafeBridgeNotNullAny() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/mapRemove/typeSafeBridgeNotNullAny.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/parametersMetadata")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParametersMetadata extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInParametersMetadata() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/parametersMetadata"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("defaultImpls.kt")
        public void testDefaultImpls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/parametersMetadata/defaultImpls.kt");
            doTest(fileName);
        }

        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/parametersMetadata/enum.kt");
            doTest(fileName);
        }

        @TestMetadata("extensionFunction.kt")
        public void testExtensionFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/parametersMetadata/extensionFunction.kt");
            doTest(fileName);
        }

        @TestMetadata("function.kt")
        public void testFunction() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/parametersMetadata/function.kt");
            doTest(fileName);
        }

        @TestMetadata("innerClass.kt")
        public void testInnerClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/parametersMetadata/innerClass.kt");
            doTest(fileName);
        }

        @TestMetadata("superParams.kt")
        public void testSuperParams() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/parametersMetadata/superParams.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/codegen/java8/box/reflection")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Reflection extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInReflection() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/reflection"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("realParameterNames.kt")
        public void testRealParameterNames() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/reflection/realParameterNames.kt");
            doTest(fileName);
        }

        @TestMetadata("synthesizedParameterNames.kt")
        public void testSynthesizedParameterNames() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/reflection/synthesizedParameterNames.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/codegen/java8/box/reflection/parameters")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Parameters extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInParameters() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/java8/box/reflection/parameters"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("javaParametersHaveDefaultNames.kt")
            public void testJavaParametersHaveDefaultNames() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/java8/box/reflection/parameters/javaParametersHaveDefaultNames.kt");
                doTest(fileName);
            }
        }
    }
}
