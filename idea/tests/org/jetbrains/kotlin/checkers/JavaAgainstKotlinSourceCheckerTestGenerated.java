/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

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
@RunWith(JUnit3RunnerWithInners.class)
public class JavaAgainstKotlinSourceCheckerTestGenerated extends AbstractJavaAgainstKotlinSourceCheckerTest {
    @TestMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class JavaAgainstKotlin extends AbstractJavaAgainstKotlinSourceCheckerTest {
        public void testAllFilesPresentInJavaAgainstKotlin() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("AssignKotlinClassToObjectInJava.kt")
        public void testAssignKotlinClassToObjectInJava() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/AssignKotlinClassToObjectInJava.kt");
            doTest(fileName);
        }

        @TestMetadata("AssignMappedKotlinType.kt")
        public void testAssignMappedKotlinType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/AssignMappedKotlinType.kt");
            doTest(fileName);
        }

        @TestMetadata("ClassObjects.kt")
        public void testClassObjects() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ClassObjects.kt");
            doTest(fileName);
        }

        @TestMetadata("EnumAutoGeneratedMethods.kt")
        public void testEnumAutoGeneratedMethods() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/EnumAutoGeneratedMethods.kt");
            doTest(fileName);
        }

        @TestMetadata("EnumEntriesInSwitch.kt")
        public void testEnumEntriesInSwitch() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/EnumEntriesInSwitch.kt");
            doTest(fileName);
        }

        @TestMetadata("EnumStaticImportInJava.kt")
        public void testEnumStaticImportInJava() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/EnumStaticImportInJava.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtendClassWithDefaultImplementationComplex.kt")
        public void testExtendClassWithDefaultImplementationComplex() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ExtendClassWithDefaultImplementationComplex.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtendClassWithDefaultImplementation_1_6.kt")
        public void testExtendClassWithDefaultImplementation_1_6() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ExtendClassWithDefaultImplementation_1_6.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtendClassWithDefaultImplementation_1_8.kt")
        public void testExtendClassWithDefaultImplementation_1_8() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ExtendClassWithDefaultImplementation_1_8.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtendingMutableInterfaces.kt")
        public void testExtendingMutableInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ExtendingMutableInterfaces.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtendingReadOnlyInterfaces.kt")
        public void testExtendingReadOnlyInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ExtendingReadOnlyInterfaces.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionInNestedClassInDataFlowInspection.kt")
        public void testFunctionInNestedClassInDataFlowInspection() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/FunctionInNestedClassInDataFlowInspection.kt");
            doTest(fileName);
        }

        @TestMetadata("ImplementedMethodsFromTraits.kt")
        public void testImplementedMethodsFromTraits() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ImplementedMethodsFromTraits.kt");
            doTest(fileName);
        }

        @TestMetadata("InferenceReturnType_1_6.kt")
        public void testInferenceReturnType_1_6() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/InferenceReturnType_1_6.kt");
            doTest(fileName);
        }

        @TestMetadata("InferenceReturnType_1_8.kt")
        public void testInferenceReturnType_1_8() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/InferenceReturnType_1_8.kt");
            doTest(fileName);
        }

        @TestMetadata("InterfaceDefaultImpls.kt")
        public void testInterfaceDefaultImpls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/InterfaceDefaultImpls.kt");
            doTest(fileName);
        }

        @TestMetadata("JvmOverloadsFunctions.kt")
        public void testJvmOverloadsFunctions() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/JvmOverloadsFunctions.kt");
            doTest(fileName);
        }

        @TestMetadata("KotlinAnnotations.kt")
        public void testKotlinAnnotations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/KotlinAnnotations.kt");
            doTest(fileName);
        }

        @TestMetadata("ReturnInnerClasses.kt")
        public void testReturnInnerClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/ReturnInnerClasses.kt");
            doTest(fileName);
        }

        @TestMetadata("TopLevelFunctionInDataFlowInspection.kt")
        public void testTopLevelFunctionInDataFlowInspection() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/TopLevelFunctionInDataFlowInspection.kt");
            doTest(fileName);
        }

        @TestMetadata("TopLevelFunctionWithNameSimilarToClassInDataFlowInspection.kt")
        public void testTopLevelFunctionWithNameSimilarToClassInDataFlowInspection() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/TopLevelFunctionWithNameSimilarToClassInDataFlowInspection.kt");
            doTest(fileName);
        }

        @TestMetadata("TopLevelFunctionWithNameSimilarToPropertyInDataFlowInspection.kt")
        public void testTopLevelFunctionWithNameSimilarToPropertyInDataFlowInspection() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/TopLevelFunctionWithNameSimilarToPropertyInDataFlowInspection.kt");
            doTest(fileName);
        }

        @TestMetadata("TopLevelOverloadedFunctionInDataFlowInspection.kt")
        public void testTopLevelOverloadedFunctionInDataFlowInspection() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/TopLevelOverloadedFunctionInDataFlowInspection.kt");
            doTest(fileName);
        }

        @TestMetadata("UseKotlinConstInSwitch.kt")
        public void testUseKotlinConstInSwitch() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/UseKotlinConstInSwitch.kt");
            doTest(fileName);
        }

        @TestMetadata("UseKotlinSubclassesOfMappedTypes.kt")
        public void testUseKotlinSubclassesOfMappedTypes() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/UseKotlinSubclassesOfMappedTypes.kt");
            doTest(fileName);
        }

        @TestMetadata("UsingKotlinPackageDeclarations.kt")
        public void testUsingKotlinPackageDeclarations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/UsingKotlinPackageDeclarations.kt");
            doTest(fileName);
        }

        @TestMetadata("UsingMutableInterfaces.kt")
        public void testUsingMutableInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/UsingMutableInterfaces.kt");
            doTest(fileName);
        }

        @TestMetadata("UsingReadOnlyInterfaces.kt")
        public void testUsingReadOnlyInterfaces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaAgainstKotlin/UsingReadOnlyInterfaces.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/kotlinAndJavaChecker/javaWithKotlin")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class JavaWithKotlin extends AbstractJavaAgainstKotlinSourceCheckerTest {
        public void testAllFilesPresentInJavaWithKotlin() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/kotlinAndJavaChecker/javaWithKotlin"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("InnerClassWithoutName.kt")
        public void testInnerClassWithoutName() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaWithKotlin/InnerClassWithoutName.kt");
            doTest(fileName);
        }

        @TestMetadata("NoNotNullOnParameterInOverride.kt")
        public void testNoNotNullOnParameterInOverride() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/kotlinAndJavaChecker/javaWithKotlin/NoNotNullOnParameterInOverride.kt");
            doTest(fileName);
        }
    }
}
