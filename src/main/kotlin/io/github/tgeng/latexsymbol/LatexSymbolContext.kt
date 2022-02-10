package io.github.tgeng.latexsymbol

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class LatexSymbolContext : TemplateContextType("OTHER", "Latex") {
    override fun isInContext(tac: TemplateActionContext): Boolean = true
}