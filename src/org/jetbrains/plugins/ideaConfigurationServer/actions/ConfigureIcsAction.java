package org.jetbrains.plugins.ideaConfigurationServer.actions;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAwareAction;
import org.jetbrains.plugins.ideaConfigurationServer.IcsManager;
import org.jetbrains.plugins.ideaConfigurationServer.IcsSettingsPanel;

class ConfigureIcsAction extends DumbAwareAction {
  @Override
  public void actionPerformed(final AnActionEvent e) {
    IcsManager.getInstance().runInAutoCommitDisabledMode(new Runnable() {
      @Override
      public void run() {
        new IcsSettingsPanel(e.getProject()).show();
      }
    });
  }
}
