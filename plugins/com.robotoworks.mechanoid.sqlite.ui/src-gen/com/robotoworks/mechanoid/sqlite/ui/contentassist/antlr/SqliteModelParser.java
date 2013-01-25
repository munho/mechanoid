/*
* generated by Xtext
*/
package com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.robotoworks.mechanoid.sqlite.services.SqliteModelGrammarAccess;

public class SqliteModelParser extends AbstractContentAssistParser {
	
	@Inject
	private SqliteModelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser createParser() {
		com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser result = new com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExprMultAccess().getOpAlternatives_1_1_0(), "rule__ExprMult__OpAlternatives_1_1_0");
					put(grammarAccess.getExprAddAccess().getOpAlternatives_1_1_0(), "rule__ExprAdd__OpAlternatives_1_1_0");
					put(grammarAccess.getExprBitAccess().getOpAlternatives_1_1_0(), "rule__ExprBit__OpAlternatives_1_1_0");
					put(grammarAccess.getExprRelateAccess().getOpAlternatives_1_1_0(), "rule__ExprRelate__OpAlternatives_1_1_0");
					put(grammarAccess.getExprEqualAccess().getOpAlternatives_1_1_0(), "rule__ExprEqual__OpAlternatives_1_1_0");
					put(grammarAccess.getNullExpressionAccess().getAlternatives(), "rule__NullExpression__Alternatives");
					put(grammarAccess.getNullExpressionAccess().getAlternatives_1_1(), "rule__NullExpression__Alternatives_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_5_3(), "rule__PrimaryExpression__Alternatives_5_3");
					put(grammarAccess.getDDLStatementAccess().getAlternatives(), "rule__DDLStatement__Alternatives");
					put(grammarAccess.getDDLStatementAccess().getWhenAlternatives_2_4_0(), "rule__DDLStatement__WhenAlternatives_2_4_0");
					put(grammarAccess.getDDLStatementAccess().getAlternatives_2_5(), "rule__DDLStatement__Alternatives_2_5");
					put(grammarAccess.getDMLStatementAccess().getAlternatives(), "rule__DMLStatement__Alternatives");
					put(grammarAccess.getInsertStatementAccess().getAlternatives_0(), "rule__InsertStatement__Alternatives_0");
					put(grammarAccess.getInsertStatementAccess().getAlternatives_4(), "rule__InsertStatement__Alternatives_4");
					put(grammarAccess.getInsertStatementAccess().getAlternatives_4_0(), "rule__InsertStatement__Alternatives_4_0");
					put(grammarAccess.getSelectCoreOperandAccess().getAlternatives_1(), "rule__SelectCoreOperand__Alternatives_1");
					put(grammarAccess.getAlterTableClauseAccess().getAlternatives(), "rule__AlterTableClause__Alternatives");
					put(grammarAccess.getColumnConstraintAccess().getAlternatives(), "rule__ColumnConstraint__Alternatives");
					put(grammarAccess.getColumnConstraintAccess().getAlternatives_0_2(), "rule__ColumnConstraint__Alternatives_0_2");
					put(grammarAccess.getDefaultValueAccess().getAlternatives(), "rule__DefaultValue__Alternatives");
					put(grammarAccess.getTableConstraintAccess().getAlternatives(), "rule__TableConstraint__Alternatives");
					put(grammarAccess.getIndexedColumnAccess().getAlternatives_1(), "rule__IndexedColumn__Alternatives_1");
					put(grammarAccess.getOrderingTermAccess().getAlternatives_1(), "rule__OrderingTerm__Alternatives_1");
					put(grammarAccess.getSingleSourceAccess().getAlternatives(), "rule__SingleSource__Alternatives");
					put(grammarAccess.getJoinStatementAccess().getAlternatives_2(), "rule__JoinStatement__Alternatives_2");
					put(grammarAccess.getResultColumnAccess().getAlternatives(), "rule__ResultColumn__Alternatives");
					put(grammarAccess.getLiteralValueAccess().getAlternatives(), "rule__LiteralValue__Alternatives");
					put(grammarAccess.getColumnTypeAccess().getAlternatives(), "rule__ColumnType__Alternatives");
					put(grammarAccess.getSqliteDataTypeAccess().getAlternatives(), "rule__SqliteDataType__Alternatives");
					put(grammarAccess.getConflictResolutionAccess().getAlternatives(), "rule__ConflictResolution__Alternatives");
					put(grammarAccess.getCompoundOperatorAccess().getAlternatives(), "rule__CompoundOperator__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getDatabaseBlockAccess().getGroup(), "rule__DatabaseBlock__Group__0");
					put(grammarAccess.getConfigBlockAccess().getGroup(), "rule__ConfigBlock__Group__0");
					put(grammarAccess.getConfigurationStatementAccess().getGroup(), "rule__ConfigurationStatement__Group__0");
					put(grammarAccess.getMigrationBlockAccess().getGroup(), "rule__MigrationBlock__Group__0");
					put(grammarAccess.getMigrationBlockAccess().getGroup_3(), "rule__MigrationBlock__Group_3__0");
					put(grammarAccess.getExprConcatAccess().getGroup(), "rule__ExprConcat__Group__0");
					put(grammarAccess.getExprConcatAccess().getGroup_1(), "rule__ExprConcat__Group_1__0");
					put(grammarAccess.getExprMultAccess().getGroup(), "rule__ExprMult__Group__0");
					put(grammarAccess.getExprMultAccess().getGroup_1(), "rule__ExprMult__Group_1__0");
					put(grammarAccess.getExprAddAccess().getGroup(), "rule__ExprAdd__Group__0");
					put(grammarAccess.getExprAddAccess().getGroup_1(), "rule__ExprAdd__Group_1__0");
					put(grammarAccess.getExprBitAccess().getGroup(), "rule__ExprBit__Group__0");
					put(grammarAccess.getExprBitAccess().getGroup_1(), "rule__ExprBit__Group_1__0");
					put(grammarAccess.getExprRelateAccess().getGroup(), "rule__ExprRelate__Group__0");
					put(grammarAccess.getExprRelateAccess().getGroup_1(), "rule__ExprRelate__Group_1__0");
					put(grammarAccess.getExprEqualAccess().getGroup(), "rule__ExprEqual__Group__0");
					put(grammarAccess.getExprEqualAccess().getGroup_1(), "rule__ExprEqual__Group_1__0");
					put(grammarAccess.getExprAndAccess().getGroup(), "rule__ExprAnd__Group__0");
					put(grammarAccess.getExprAndAccess().getGroup_1(), "rule__ExprAnd__Group_1__0");
					put(grammarAccess.getExprOrAccess().getGroup(), "rule__ExprOr__Group__0");
					put(grammarAccess.getExprOrAccess().getGroup_1(), "rule__ExprOr__Group_1__0");
					put(grammarAccess.getNullCheckExpressionAccess().getGroup(), "rule__NullCheckExpression__Group__0");
					put(grammarAccess.getNullCheckExpressionAccess().getGroup_1(), "rule__NullCheckExpression__Group_1__0");
					put(grammarAccess.getNullExpressionAccess().getGroup_0(), "rule__NullExpression__Group_0__0");
					put(grammarAccess.getNullExpressionAccess().getGroup_1(), "rule__NullExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_3(), "rule__PrimaryExpression__Group_3__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_4(), "rule__PrimaryExpression__Group_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_4_4(), "rule__PrimaryExpression__Group_4_4__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5(), "rule__PrimaryExpression__Group_5__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5_3_1(), "rule__PrimaryExpression__Group_5_3_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_5_3_1_1(), "rule__PrimaryExpression__Group_5_3_1_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_6(), "rule__PrimaryExpression__Group_6__0");
					put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_0(), "rule__DDLStatement__Group_0__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_0_6(), "rule__DDLStatement__Group_0_6__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_0_7(), "rule__DDLStatement__Group_0_7__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_1(), "rule__DDLStatement__Group_1__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2(), "rule__DDLStatement__Group_2__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2_5_2(), "rule__DDLStatement__Group_2_5_2__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2_5_2_1(), "rule__DDLStatement__Group_2_5_2_1__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2_5_2_1_2(), "rule__DDLStatement__Group_2_5_2_1_2__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2_9(), "rule__DDLStatement__Group_2_9__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2_11(), "rule__DDLStatement__Group_2_11__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_2_11_2(), "rule__DDLStatement__Group_2_11_2__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_3(), "rule__DDLStatement__Group_3__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_4(), "rule__DDLStatement__Group_4__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_5(), "rule__DDLStatement__Group_5__0");
					put(grammarAccess.getDDLStatementAccess().getGroup_6(), "rule__DDLStatement__Group_6__0");
					put(grammarAccess.getDeleteStatementAccess().getGroup(), "rule__DeleteStatement__Group__0");
					put(grammarAccess.getDeleteStatementAccess().getGroup_3(), "rule__DeleteStatement__Group_3__0");
					put(grammarAccess.getInsertStatementAccess().getGroup(), "rule__InsertStatement__Group__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_0_0(), "rule__InsertStatement__Group_0_0__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_0_0_1(), "rule__InsertStatement__Group_0_0_1__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_3(), "rule__InsertStatement__Group_3__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_3_2(), "rule__InsertStatement__Group_3_2__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_4_0_0(), "rule__InsertStatement__Group_4_0_0__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_4_0_0_3(), "rule__InsertStatement__Group_4_0_0_3__0");
					put(grammarAccess.getInsertStatementAccess().getGroup_4_1(), "rule__InsertStatement__Group_4_1__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup(), "rule__UpdateStatement__Group__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup_1(), "rule__UpdateStatement__Group_1__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup_5(), "rule__UpdateStatement__Group_5__0");
					put(grammarAccess.getUpdateStatementAccess().getGroup_6(), "rule__UpdateStatement__Group_6__0");
					put(grammarAccess.getUpdateColumnExpressionAccess().getGroup(), "rule__UpdateColumnExpression__Group__0");
					put(grammarAccess.getSelectStatementAccess().getGroup(), "rule__SelectStatement__Group__0");
					put(grammarAccess.getSelectStatementAccess().getGroup_1(), "rule__SelectStatement__Group_1__0");
					put(grammarAccess.getSelectStatementAccess().getGroup_1_2(), "rule__SelectStatement__Group_1_2__0");
					put(grammarAccess.getSelectCoreAccess().getGroup(), "rule__SelectCore__Group__0");
					put(grammarAccess.getSelectCoreAccess().getGroup_1(), "rule__SelectCore__Group_1__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup(), "rule__SelectCoreOperand__Group__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup_3(), "rule__SelectCoreOperand__Group_3__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup_4(), "rule__SelectCoreOperand__Group_4__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup_5(), "rule__SelectCoreOperand__Group_5__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup_6(), "rule__SelectCoreOperand__Group_6__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup_6_2(), "rule__SelectCoreOperand__Group_6_2__0");
					put(grammarAccess.getSelectCoreOperandAccess().getGroup_7(), "rule__SelectCoreOperand__Group_7__0");
					put(grammarAccess.getAlterTableClauseAccess().getGroup_0(), "rule__AlterTableClause__Group_0__0");
					put(grammarAccess.getAlterTableClauseAccess().getGroup_1(), "rule__AlterTableClause__Group_1__0");
					put(grammarAccess.getColumnDefAccess().getGroup(), "rule__ColumnDef__Group__0");
					put(grammarAccess.getColumnConstraintAccess().getGroup_0(), "rule__ColumnConstraint__Group_0__0");
					put(grammarAccess.getColumnConstraintAccess().getGroup_1(), "rule__ColumnConstraint__Group_1__0");
					put(grammarAccess.getColumnConstraintAccess().getGroup_2(), "rule__ColumnConstraint__Group_2__0");
					put(grammarAccess.getDefaultValueAccess().getGroup_0(), "rule__DefaultValue__Group_0__0");
					put(grammarAccess.getDefaultValueAccess().getGroup_1(), "rule__DefaultValue__Group_1__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_0(), "rule__TableConstraint__Group_0__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_0_1(), "rule__TableConstraint__Group_0_1__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_0_5(), "rule__TableConstraint__Group_0_5__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_1(), "rule__TableConstraint__Group_1__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_1_1(), "rule__TableConstraint__Group_1_1__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_1_6(), "rule__TableConstraint__Group_1_6__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_2(), "rule__TableConstraint__Group_2__0");
					put(grammarAccess.getTableConstraintAccess().getGroup_2_1(), "rule__TableConstraint__Group_2_1__0");
					put(grammarAccess.getIndexedColumnAccess().getGroup(), "rule__IndexedColumn__Group__0");
					put(grammarAccess.getOrderingTermAccess().getGroup(), "rule__OrderingTerm__Group__0");
					put(grammarAccess.getJoinSourceAccess().getGroup(), "rule__JoinSource__Group__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_0(), "rule__SingleSource__Group_0__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_0_2(), "rule__SingleSource__Group_0_2__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_1(), "rule__SingleSource__Group_1__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_1_4(), "rule__SingleSource__Group_1_4__0");
					put(grammarAccess.getSingleSourceAccess().getGroup_2(), "rule__SingleSource__Group_2__0");
					put(grammarAccess.getJoinStatementAccess().getGroup(), "rule__JoinStatement__Group__0");
					put(grammarAccess.getJoinStatementAccess().getGroup_2_0(), "rule__JoinStatement__Group_2_0__0");
					put(grammarAccess.getResultColumnAccess().getGroup_0(), "rule__ResultColumn__Group_0__0");
					put(grammarAccess.getResultColumnAccess().getGroup_0_1(), "rule__ResultColumn__Group_0_1__0");
					put(grammarAccess.getResultColumnAccess().getGroup_1(), "rule__ResultColumn__Group_1__0");
					put(grammarAccess.getResultColumnAccess().getGroup_1_2(), "rule__ResultColumn__Group_1_2__0");
					put(grammarAccess.getConflictClauseAccess().getGroup(), "rule__ConflictClause__Group__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_0(), "rule__LiteralValue__Group_0__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_1(), "rule__LiteralValue__Group_1__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_2(), "rule__LiteralValue__Group_2__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_3(), "rule__LiteralValue__Group_3__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_4(), "rule__LiteralValue__Group_4__0");
					put(grammarAccess.getLiteralValueAccess().getGroup_5(), "rule__LiteralValue__Group_5__0");
					put(grammarAccess.getSignedNumberAccess().getGroup(), "rule__SignedNumber__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getModelAccess().getPackageNameAssignment_1(), "rule__Model__PackageNameAssignment_1");
					put(grammarAccess.getModelAccess().getDatabaseAssignment_2(), "rule__Model__DatabaseAssignment_2");
					put(grammarAccess.getDatabaseBlockAccess().getNameAssignment_1(), "rule__DatabaseBlock__NameAssignment_1");
					put(grammarAccess.getDatabaseBlockAccess().getConfigAssignment_3(), "rule__DatabaseBlock__ConfigAssignment_3");
					put(grammarAccess.getDatabaseBlockAccess().getMigrationsAssignment_4(), "rule__DatabaseBlock__MigrationsAssignment_4");
					put(grammarAccess.getConfigBlockAccess().getStatementsAssignment_3(), "rule__ConfigBlock__StatementsAssignment_3");
					put(grammarAccess.getConfigurationStatementAccess().getNameAssignment_2(), "rule__ConfigurationStatement__NameAssignment_2");
					put(grammarAccess.getConfigurationStatementAccess().getPathAssignment_3(), "rule__ConfigurationStatement__PathAssignment_3");
					put(grammarAccess.getMigrationBlockAccess().getStatementsAssignment_3_0(), "rule__MigrationBlock__StatementsAssignment_3_0");
					put(grammarAccess.getExprConcatAccess().getOpAssignment_1_1(), "rule__ExprConcat__OpAssignment_1_1");
					put(grammarAccess.getExprConcatAccess().getRightAssignment_1_2(), "rule__ExprConcat__RightAssignment_1_2");
					put(grammarAccess.getExprMultAccess().getOpAssignment_1_1(), "rule__ExprMult__OpAssignment_1_1");
					put(grammarAccess.getExprMultAccess().getRightAssignment_1_2(), "rule__ExprMult__RightAssignment_1_2");
					put(grammarAccess.getExprAddAccess().getOpAssignment_1_1(), "rule__ExprAdd__OpAssignment_1_1");
					put(grammarAccess.getExprAddAccess().getRightAssignment_1_2(), "rule__ExprAdd__RightAssignment_1_2");
					put(grammarAccess.getExprBitAccess().getOpAssignment_1_1(), "rule__ExprBit__OpAssignment_1_1");
					put(grammarAccess.getExprBitAccess().getRightAssignment_1_2(), "rule__ExprBit__RightAssignment_1_2");
					put(grammarAccess.getExprRelateAccess().getOpAssignment_1_1(), "rule__ExprRelate__OpAssignment_1_1");
					put(grammarAccess.getExprRelateAccess().getRightAssignment_1_2(), "rule__ExprRelate__RightAssignment_1_2");
					put(grammarAccess.getExprEqualAccess().getOpAssignment_1_1(), "rule__ExprEqual__OpAssignment_1_1");
					put(grammarAccess.getExprEqualAccess().getRightAssignment_1_2(), "rule__ExprEqual__RightAssignment_1_2");
					put(grammarAccess.getExprAndAccess().getOpAssignment_1_1(), "rule__ExprAnd__OpAssignment_1_1");
					put(grammarAccess.getExprAndAccess().getRightAssignment_1_2(), "rule__ExprAnd__RightAssignment_1_2");
					put(grammarAccess.getExprOrAccess().getOpAssignment_1_1(), "rule__ExprOr__OpAssignment_1_1");
					put(grammarAccess.getExprOrAccess().getRightAssignment_1_2(), "rule__ExprOr__RightAssignment_1_2");
					put(grammarAccess.getNullCheckExpressionAccess().getRightAssignment_1_1(), "rule__NullCheckExpression__RightAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_0_1(), "rule__PrimaryExpression__NameAssignment_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getLiteralValueAssignment_1_1(), "rule__PrimaryExpression__LiteralValueAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_2_2(), "rule__PrimaryExpression__ExpressionAssignment_2_2");
					put(grammarAccess.getPrimaryExpressionAccess().getNotAssignment_3_1(), "rule__PrimaryExpression__NotAssignment_3_1");
					put(grammarAccess.getPrimaryExpressionAccess().getExistsAssignment_3_2(), "rule__PrimaryExpression__ExistsAssignment_3_2");
					put(grammarAccess.getPrimaryExpressionAccess().getSelectAssignment_3_4(), "rule__PrimaryExpression__SelectAssignment_3_4");
					put(grammarAccess.getPrimaryExpressionAccess().getCaseExpressionAssignment_4_2(), "rule__PrimaryExpression__CaseExpressionAssignment_4_2");
					put(grammarAccess.getPrimaryExpressionAccess().getCasesAssignment_4_3(), "rule__PrimaryExpression__CasesAssignment_4_3");
					put(grammarAccess.getPrimaryExpressionAccess().getElseExpressionAssignment_4_4_1(), "rule__PrimaryExpression__ElseExpressionAssignment_4_4_1");
					put(grammarAccess.getPrimaryExpressionAccess().getNameAssignment_5_1(), "rule__PrimaryExpression__NameAssignment_5_1");
					put(grammarAccess.getPrimaryExpressionAccess().getAllAssignment_5_3_0(), "rule__PrimaryExpression__AllAssignment_5_3_0");
					put(grammarAccess.getPrimaryExpressionAccess().getArgumentsAssignment_5_3_1_0(), "rule__PrimaryExpression__ArgumentsAssignment_5_3_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getArugmentsAssignment_5_3_1_1_1(), "rule__PrimaryExpression__ArugmentsAssignment_5_3_1_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getExpressionAssignment_6_3(), "rule__PrimaryExpression__ExpressionAssignment_6_3");
					put(grammarAccess.getPrimaryExpressionAccess().getTypeAssignment_6_5(), "rule__PrimaryExpression__TypeAssignment_6_5");
					put(grammarAccess.getCaseAccess().getWhenExpressionAssignment_1(), "rule__Case__WhenExpressionAssignment_1");
					put(grammarAccess.getCaseAccess().getThenExpressionAssignment_3(), "rule__Case__ThenExpressionAssignment_3");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_0_3(), "rule__DDLStatement__NameAssignment_0_3");
					put(grammarAccess.getDDLStatementAccess().getColumnDefsAssignment_0_5(), "rule__DDLStatement__ColumnDefsAssignment_0_5");
					put(grammarAccess.getDDLStatementAccess().getColumnDefsAssignment_0_6_1(), "rule__DDLStatement__ColumnDefsAssignment_0_6_1");
					put(grammarAccess.getDDLStatementAccess().getConstraintsAssignment_0_7_1(), "rule__DDLStatement__ConstraintsAssignment_0_7_1");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_1_3(), "rule__DDLStatement__NameAssignment_1_3");
					put(grammarAccess.getDDLStatementAccess().getSelectStatementAssignment_1_5(), "rule__DDLStatement__SelectStatementAssignment_1_5");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_2_3(), "rule__DDLStatement__NameAssignment_2_3");
					put(grammarAccess.getDDLStatementAccess().getWhenAssignment_2_4(), "rule__DDLStatement__WhenAssignment_2_4");
					put(grammarAccess.getDDLStatementAccess().getEventTypeAssignment_2_5_0(), "rule__DDLStatement__EventTypeAssignment_2_5_0");
					put(grammarAccess.getDDLStatementAccess().getEventTypeAssignment_2_5_1(), "rule__DDLStatement__EventTypeAssignment_2_5_1");
					put(grammarAccess.getDDLStatementAccess().getEventTypeAssignment_2_5_2_0(), "rule__DDLStatement__EventTypeAssignment_2_5_2_0");
					put(grammarAccess.getDDLStatementAccess().getUpdateColumnNamesAssignment_2_5_2_1_1(), "rule__DDLStatement__UpdateColumnNamesAssignment_2_5_2_1_1");
					put(grammarAccess.getDDLStatementAccess().getUpdateColumnNamesAssignment_2_5_2_1_2_1(), "rule__DDLStatement__UpdateColumnNamesAssignment_2_5_2_1_2_1");
					put(grammarAccess.getDDLStatementAccess().getTableNameAssignment_2_7(), "rule__DDLStatement__TableNameAssignment_2_7");
					put(grammarAccess.getDDLStatementAccess().getForEachRowAssignment_2_8(), "rule__DDLStatement__ForEachRowAssignment_2_8");
					put(grammarAccess.getDDLStatementAccess().getWhenExpressionAssignment_2_9_1(), "rule__DDLStatement__WhenExpressionAssignment_2_9_1");
					put(grammarAccess.getDDLStatementAccess().getStatementsAssignment_2_11_0(), "rule__DDLStatement__StatementsAssignment_2_11_0");
					put(grammarAccess.getDDLStatementAccess().getStatementsAssignment_2_11_2_0(), "rule__DDLStatement__StatementsAssignment_2_11_2_0");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_3_3(), "rule__DDLStatement__NameAssignment_3_3");
					put(grammarAccess.getDDLStatementAccess().getClauseAssignment_3_4(), "rule__DDLStatement__ClauseAssignment_3_4");
					put(grammarAccess.getDDLStatementAccess().getIfExistsAssignment_4_3(), "rule__DDLStatement__IfExistsAssignment_4_3");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_4_4(), "rule__DDLStatement__NameAssignment_4_4");
					put(grammarAccess.getDDLStatementAccess().getIfExistsAssignment_5_3(), "rule__DDLStatement__IfExistsAssignment_5_3");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_5_4(), "rule__DDLStatement__NameAssignment_5_4");
					put(grammarAccess.getDDLStatementAccess().getIfExistsAssignment_6_3(), "rule__DDLStatement__IfExistsAssignment_6_3");
					put(grammarAccess.getDDLStatementAccess().getNameAssignment_6_4(), "rule__DDLStatement__NameAssignment_6_4");
					put(grammarAccess.getDeleteStatementAccess().getTableNameAssignment_2(), "rule__DeleteStatement__TableNameAssignment_2");
					put(grammarAccess.getDeleteStatementAccess().getExpressionAssignment_3_1(), "rule__DeleteStatement__ExpressionAssignment_3_1");
					put(grammarAccess.getInsertStatementAccess().getConflictResolutionAssignment_0_0_1_1(), "rule__InsertStatement__ConflictResolutionAssignment_0_0_1_1");
					put(grammarAccess.getInsertStatementAccess().getTableNameAssignment_2(), "rule__InsertStatement__TableNameAssignment_2");
					put(grammarAccess.getInsertStatementAccess().getColumnNamesAssignment_3_1(), "rule__InsertStatement__ColumnNamesAssignment_3_1");
					put(grammarAccess.getInsertStatementAccess().getColumnNamesAssignment_3_2_1(), "rule__InsertStatement__ColumnNamesAssignment_3_2_1");
					put(grammarAccess.getInsertStatementAccess().getExpressionsAssignment_4_0_0_2(), "rule__InsertStatement__ExpressionsAssignment_4_0_0_2");
					put(grammarAccess.getInsertStatementAccess().getExpressionsAssignment_4_0_0_3_1(), "rule__InsertStatement__ExpressionsAssignment_4_0_0_3_1");
					put(grammarAccess.getInsertStatementAccess().getSelectStatementAssignment_4_0_1(), "rule__InsertStatement__SelectStatementAssignment_4_0_1");
					put(grammarAccess.getUpdateStatementAccess().getConflictResolutionAssignment_1_1(), "rule__UpdateStatement__ConflictResolutionAssignment_1_1");
					put(grammarAccess.getUpdateStatementAccess().getTableNameAssignment_2(), "rule__UpdateStatement__TableNameAssignment_2");
					put(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsAssignment_4(), "rule__UpdateStatement__UpdateColumnExpressionsAssignment_4");
					put(grammarAccess.getUpdateStatementAccess().getUpdateColumnExpressionsAssignment_5_1(), "rule__UpdateStatement__UpdateColumnExpressionsAssignment_5_1");
					put(grammarAccess.getUpdateStatementAccess().getWhereExpressionAssignment_6_1(), "rule__UpdateStatement__WhereExpressionAssignment_6_1");
					put(grammarAccess.getUpdateColumnExpressionAccess().getColumnNameAssignment_0(), "rule__UpdateColumnExpression__ColumnNameAssignment_0");
					put(grammarAccess.getUpdateColumnExpressionAccess().getExpressionAssignment_2(), "rule__UpdateColumnExpression__ExpressionAssignment_2");
					put(grammarAccess.getSelectStatementAccess().getCoreAssignment_0(), "rule__SelectStatement__CoreAssignment_0");
					put(grammarAccess.getSelectStatementAccess().getOrderingTermsAssignment_1_1(), "rule__SelectStatement__OrderingTermsAssignment_1_1");
					put(grammarAccess.getSelectStatementAccess().getOrderingTermsAssignment_1_2_1(), "rule__SelectStatement__OrderingTermsAssignment_1_2_1");
					put(grammarAccess.getSelectCoreAccess().getOpAssignment_1_1(), "rule__SelectCore__OpAssignment_1_1");
					put(grammarAccess.getSelectCoreAccess().getRightAssignment_1_2(), "rule__SelectCore__RightAssignment_1_2");
					put(grammarAccess.getSelectCoreOperandAccess().getDistinctAssignment_1_0(), "rule__SelectCoreOperand__DistinctAssignment_1_0");
					put(grammarAccess.getSelectCoreOperandAccess().getAllAssignment_1_1(), "rule__SelectCoreOperand__AllAssignment_1_1");
					put(grammarAccess.getSelectCoreOperandAccess().getResultColumnsAssignment_2(), "rule__SelectCoreOperand__ResultColumnsAssignment_2");
					put(grammarAccess.getSelectCoreOperandAccess().getResultColumnsAssignment_3_1(), "rule__SelectCoreOperand__ResultColumnsAssignment_3_1");
					put(grammarAccess.getSelectCoreOperandAccess().getSourceAssignment_4_1(), "rule__SelectCoreOperand__SourceAssignment_4_1");
					put(grammarAccess.getSelectCoreOperandAccess().getWhereExpressionAssignment_5_1(), "rule__SelectCoreOperand__WhereExpressionAssignment_5_1");
					put(grammarAccess.getSelectCoreOperandAccess().getGroupByExpressionsAssignment_6_1(), "rule__SelectCoreOperand__GroupByExpressionsAssignment_6_1");
					put(grammarAccess.getSelectCoreOperandAccess().getGroupByExpressionsAssignment_6_2_1(), "rule__SelectCoreOperand__GroupByExpressionsAssignment_6_2_1");
					put(grammarAccess.getSelectCoreOperandAccess().getHavingExpressionAssignment_7_1(), "rule__SelectCoreOperand__HavingExpressionAssignment_7_1");
					put(grammarAccess.getAlterTableClauseAccess().getNameAssignment_0_2(), "rule__AlterTableClause__NameAssignment_0_2");
					put(grammarAccess.getAlterTableClauseAccess().getColumnDefAssignment_1_2(), "rule__AlterTableClause__ColumnDefAssignment_1_2");
					put(grammarAccess.getColumnDefAccess().getNameAssignment_0(), "rule__ColumnDef__NameAssignment_0");
					put(grammarAccess.getColumnDefAccess().getTypeAssignment_1(), "rule__ColumnDef__TypeAssignment_1");
					put(grammarAccess.getColumnDefAccess().getConstraintsAssignment_2(), "rule__ColumnDef__ConstraintsAssignment_2");
					put(grammarAccess.getColumnConstraintAccess().getAscAssignment_0_2_0(), "rule__ColumnConstraint__AscAssignment_0_2_0");
					put(grammarAccess.getColumnConstraintAccess().getDescAssignment_0_2_1(), "rule__ColumnConstraint__DescAssignment_0_2_1");
					put(grammarAccess.getColumnConstraintAccess().getAutoincrementAssignment_0_3(), "rule__ColumnConstraint__AutoincrementAssignment_0_3");
					put(grammarAccess.getColumnConstraintAccess().getConflictClauseAssignment_1_2(), "rule__ColumnConstraint__ConflictClauseAssignment_1_2");
					put(grammarAccess.getColumnConstraintAccess().getDefaultValueAssignment_2_2(), "rule__ColumnConstraint__DefaultValueAssignment_2_2");
					put(grammarAccess.getDefaultValueAccess().getLiteralAssignment_0_1(), "rule__DefaultValue__LiteralAssignment_0_1");
					put(grammarAccess.getDefaultValueAccess().getExpressionAssignment_1_2(), "rule__DefaultValue__ExpressionAssignment_1_2");
					put(grammarAccess.getTableConstraintAccess().getNameAssignment_0_1_1(), "rule__TableConstraint__NameAssignment_0_1_1");
					put(grammarAccess.getTableConstraintAccess().getColumnsAssignment_0_4(), "rule__TableConstraint__ColumnsAssignment_0_4");
					put(grammarAccess.getTableConstraintAccess().getColumnsAssignment_0_5_1(), "rule__TableConstraint__ColumnsAssignment_0_5_1");
					put(grammarAccess.getTableConstraintAccess().getConflictClauseAssignment_0_7(), "rule__TableConstraint__ConflictClauseAssignment_0_7");
					put(grammarAccess.getTableConstraintAccess().getNameAssignment_1_1_1(), "rule__TableConstraint__NameAssignment_1_1_1");
					put(grammarAccess.getTableConstraintAccess().getColumnsAssignment_1_5(), "rule__TableConstraint__ColumnsAssignment_1_5");
					put(grammarAccess.getTableConstraintAccess().getColumnsAssignment_1_6_1(), "rule__TableConstraint__ColumnsAssignment_1_6_1");
					put(grammarAccess.getTableConstraintAccess().getConflictClauseAssignment_1_8(), "rule__TableConstraint__ConflictClauseAssignment_1_8");
					put(grammarAccess.getTableConstraintAccess().getNameAssignment_2_1_1(), "rule__TableConstraint__NameAssignment_2_1_1");
					put(grammarAccess.getTableConstraintAccess().getExpressionAssignment_2_4(), "rule__TableConstraint__ExpressionAssignment_2_4");
					put(grammarAccess.getIndexedColumnAccess().getNameAssignment_0(), "rule__IndexedColumn__NameAssignment_0");
					put(grammarAccess.getIndexedColumnAccess().getAscAssignment_1_0(), "rule__IndexedColumn__AscAssignment_1_0");
					put(grammarAccess.getIndexedColumnAccess().getDescAssignment_1_1(), "rule__IndexedColumn__DescAssignment_1_1");
					put(grammarAccess.getOrderingTermAccess().getExpressionAssignment_0(), "rule__OrderingTerm__ExpressionAssignment_0");
					put(grammarAccess.getOrderingTermAccess().getAscAssignment_1_0(), "rule__OrderingTerm__AscAssignment_1_0");
					put(grammarAccess.getOrderingTermAccess().getDescAssignment_1_1(), "rule__OrderingTerm__DescAssignment_1_1");
					put(grammarAccess.getJoinSourceAccess().getSourceAssignment_0(), "rule__JoinSource__SourceAssignment_0");
					put(grammarAccess.getJoinSourceAccess().getJoinStatementsAssignment_1(), "rule__JoinSource__JoinStatementsAssignment_1");
					put(grammarAccess.getSingleSourceAccess().getTableAssignment_0_1(), "rule__SingleSource__TableAssignment_0_1");
					put(grammarAccess.getSingleSourceAccess().getNameAssignment_0_2_1(), "rule__SingleSource__NameAssignment_0_2_1");
					put(grammarAccess.getSingleSourceAccess().getSelectStatementAssignment_1_2(), "rule__SingleSource__SelectStatementAssignment_1_2");
					put(grammarAccess.getSingleSourceAccess().getNameAssignment_1_4_1(), "rule__SingleSource__NameAssignment_1_4_1");
					put(grammarAccess.getSingleSourceAccess().getJoinSourceAssignment_2_2(), "rule__SingleSource__JoinSourceAssignment_2_2");
					put(grammarAccess.getJoinStatementAccess().getNaturalAssignment_1(), "rule__JoinStatement__NaturalAssignment_1");
					put(grammarAccess.getJoinStatementAccess().getLeftAssignment_2_0_0(), "rule__JoinStatement__LeftAssignment_2_0_0");
					put(grammarAccess.getJoinStatementAccess().getOuterAssignment_2_0_1(), "rule__JoinStatement__OuterAssignment_2_0_1");
					put(grammarAccess.getJoinStatementAccess().getInnerAssignment_2_1(), "rule__JoinStatement__InnerAssignment_2_1");
					put(grammarAccess.getJoinStatementAccess().getCrossAssignment_2_2(), "rule__JoinStatement__CrossAssignment_2_2");
					put(grammarAccess.getJoinStatementAccess().getSingleSourceAssignment_4(), "rule__JoinStatement__SingleSourceAssignment_4");
					put(grammarAccess.getJoinStatementAccess().getExpressionAssignment_6(), "rule__JoinStatement__ExpressionAssignment_6");
					put(grammarAccess.getResultColumnAccess().getSourceAssignment_0_1_0(), "rule__ResultColumn__SourceAssignment_0_1_0");
					put(grammarAccess.getResultColumnAccess().getExpressionAssignment_1_1(), "rule__ResultColumn__ExpressionAssignment_1_1");
					put(grammarAccess.getResultColumnAccess().getNameAssignment_1_2_1(), "rule__ResultColumn__NameAssignment_1_2_1");
					put(grammarAccess.getConflictClauseAccess().getResolutionAssignment_2(), "rule__ConflictClause__ResolutionAssignment_2");
					put(grammarAccess.getLiteralValueAccess().getNumberAssignment_0_1(), "rule__LiteralValue__NumberAssignment_0_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_1_1(), "rule__LiteralValue__LiteralAssignment_1_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_2_1(), "rule__LiteralValue__LiteralAssignment_2_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_3_1(), "rule__LiteralValue__LiteralAssignment_3_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_4_1(), "rule__LiteralValue__LiteralAssignment_4_1");
					put(grammarAccess.getLiteralValueAccess().getLiteralAssignment_5_1(), "rule__LiteralValue__LiteralAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser typedParser = (com.robotoworks.mechanoid.sqlite.ui.contentassist.antlr.internal.InternalSqliteModelParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SqliteModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SqliteModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}