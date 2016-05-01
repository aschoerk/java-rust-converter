package de.aschoerk.javaconv;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.TypeParameter;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.type.*;
import com.github.javaparser.ast.visitor.VoidVisitor;

/**
 * Created by aschoerk on 30.04.16.
 */
public class BaseVisitor implements VoidVisitor<JavaConverterData> {
    @Override
    public void visit(CompilationUnit n, JavaConverterData arg) {

    }

    @Override
    public void visit(PackageDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(ImportDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(TypeParameter n, JavaConverterData arg) {

    }

    @Override
    public void visit(LineComment n, JavaConverterData arg) {

    }

    @Override
    public void visit(BlockComment n, JavaConverterData arg) {

    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(EnumDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(EmptyTypeDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(EnumConstantDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(AnnotationDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(AnnotationMemberDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(FieldDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(VariableDeclarator n, JavaConverterData arg) {

    }

    @Override
    public void visit(VariableDeclaratorId n, JavaConverterData arg) {

    }

    @Override
    public void visit(ConstructorDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(MethodDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(Parameter n, JavaConverterData arg) {

    }

    @Override
    public void visit(MultiTypeParameter n, JavaConverterData arg) {

    }

    @Override
    public void visit(EmptyMemberDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(InitializerDeclaration n, JavaConverterData arg) {

    }

    @Override
    public void visit(JavadocComment n, JavaConverterData arg) {

    }

    @Override
    public void visit(ClassOrInterfaceType n, JavaConverterData arg) {

    }

    @Override
    public void visit(PrimitiveType n, JavaConverterData arg) {

    }

    @Override
    public void visit(ReferenceType n, JavaConverterData arg) {

    }

    @Override
    public void visit(IntersectionType n, JavaConverterData arg) {

    }

    @Override
    public void visit(UnionType n, JavaConverterData arg) {

    }

    @Override
    public void visit(VoidType n, JavaConverterData arg) {

    }

    @Override
    public void visit(WildcardType n, JavaConverterData arg) {

    }

    @Override
    public void visit(UnknownType n, JavaConverterData arg) {

    }

    @Override
    public void visit(ArrayAccessExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(ArrayCreationExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(ArrayInitializerExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(AssignExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(BinaryExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(CastExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(ClassExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(ConditionalExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(EnclosedExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(FieldAccessExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(InstanceOfExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(StringLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(IntegerLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(LongLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(IntegerLiteralMinValueExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(LongLiteralMinValueExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(CharLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(DoubleLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(BooleanLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(NullLiteralExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(MethodCallExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(NameExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(ObjectCreationExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(QualifiedNameExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(ThisExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(SuperExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(UnaryExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(VariableDeclarationExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(MarkerAnnotationExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(SingleMemberAnnotationExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(NormalAnnotationExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(MemberValuePair n, JavaConverterData arg) {

    }

    @Override
    public void visit(ExplicitConstructorInvocationStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(TypeDeclarationStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(AssertStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(BlockStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(LabeledStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(EmptyStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(ExpressionStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(SwitchStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(SwitchEntryStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(BreakStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(ReturnStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(IfStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(WhileStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(ContinueStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(DoStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(ForeachStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(ForStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(ThrowStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(SynchronizedStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(TryStmt n, JavaConverterData arg) {

    }

    @Override
    public void visit(CatchClause n, JavaConverterData arg) {

    }

    @Override
    public void visit(LambdaExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(MethodReferenceExpr n, JavaConverterData arg) {

    }

    @Override
    public void visit(TypeExpr n, JavaConverterData arg) {

    }
}
