<template>
  <div class="app-container acp-dashboard">

    <!-- 应用统计 
    <OperationWorkspaceCountStaitcs />
    -->

    <!-- 应用套件和状态 -->
    <OperationWorkspaceService />

    <!-- 运行应用列表 -->
    <DashboardNotices />

  </div>
</template>

<script setup name="Index">

import OperationWorkspaceCountStaitcs from './operation-workspace/countStatics.vue'
import OperationWorkspaceService from './operation-workspace/service.vue'
import DashboardNotices from './operation-workspace/notices.vue'

</script>
